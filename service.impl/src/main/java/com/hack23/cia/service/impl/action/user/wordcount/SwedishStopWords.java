/*
 * Copyright 2010-2019 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.impl.action.user.wordcount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import smile.nlp.dictionary.StopWords;

/**
 * The Class SwedishStopWords.
 */
public class SwedishStopWords implements StopWords {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(WordCounterImpl.class);

	/**
	 * A set of stop words.
	 */
	private HashSet<String> dict;

	/**
	 * Constructor.
	 */
	public SwedishStopWords() {
		dict = new HashSet<>();

		try {
			URL url = new URL("https://raw.githubusercontent.com/peterdalle/svensktext/master/stoppord/stoppord.csv");
			try (BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream(),StandardCharsets.UTF_8))) {
				String line = null;
				while ((line = input.readLine()) != null) {
					line = line.trim();
					if (!line.isEmpty()) {
						dict.add(line);
					}
				}
			} catch (IOException ex) {
				LOGGER.warn("",ex);
			}

		} catch (MalformedURLException e) {
			LOGGER.warn("",e);
		}
	}

	/**
	 * Contains.
	 *
	 * @param word the word
	 * @return true, if successful
	 */
	@Override
	public boolean contains(String word) {
		return dict.contains(word);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	@Override
	public int size() {
		return dict.size();
	}

	/**
	 * Iterator.
	 *
	 * @return the iterator
	 */
	@Override
	public Iterator<String> iterator() {
		return dict.iterator();
	}
}
