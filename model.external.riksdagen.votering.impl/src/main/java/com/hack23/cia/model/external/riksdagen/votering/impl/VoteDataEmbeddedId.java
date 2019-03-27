/*
 * Copyright 2010 James Pether Sörling
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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:13 PM CET 
//


package com.hack23.cia.model.external.riksdagen.votering.impl;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class VoteDataEmbeddedId.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDataEmbeddedId", propOrder = {
    "issue",
    "ballotId",
    "intressentId",
    "concern"
})
@Embeddable
public class VoteDataEmbeddedId
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The issue. */
    @XmlElement(name = "punkt", required = true)
    protected String issue;
    
    /** The ballot id. */
    @XmlElement(name = "votering_id", required = true)
    protected String ballotId;
    
    /** The intressent id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    
    /** The concern. */
    @XmlElement(name = "avser", required = true)
    @XmlSchemaType(name = "string")
    protected VoteIssueType concern;

    /**
	 * Gets the issue.
	 *
	 * @return the issue
	 */
    @Basic
    @Column(name = "ISSUE")
    public String getIssue() {
        return issue;
    }

    /**
	 * Sets the issue.
	 *
	 * @param value the new issue
	 */
    public void setIssue(final String value) {
        this.issue = value;
    }

    /**
	 * Gets the ballot id.
	 *
	 * @return the ballot id
	 */
    @Basic
    @Column(name = "BALLOT_ID")
    public String getBallotId() {
        return ballotId;
    }

    /**
	 * Sets the ballot id.
	 *
	 * @param value the new ballot id
	 */
    public void setBallotId(final String value) {
        this.ballotId = value;
    }

    /**
	 * Gets the intressent id.
	 *
	 * @return the intressent id
	 */
    @Basic
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
	 * Sets the intressent id.
	 *
	 * @param value the new intressent id
	 */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    /**
	 * Gets the concern.
	 *
	 * @return the concern
	 */
    @Basic
    @Column(name = "CONCERN")
    @Enumerated(EnumType.STRING)
    public VoteIssueType getConcern() {
        return concern;
    }

    /**
	 * Sets the concern.
	 *
	 * @param value the new concern
	 */
    public void setConcern(final VoteIssueType value) {
        this.concern = value;
    }

    /**
	 * With issue.
	 *
	 * @param value the value
	 * @return the vote data embedded id
	 */
    public VoteDataEmbeddedId withIssue(final String value) {
        setIssue(value);
        return this;
    }

    /**
	 * With ballot id.
	 *
	 * @param value the value
	 * @return the vote data embedded id
	 */
    public VoteDataEmbeddedId withBallotId(final String value) {
        setBallotId(value);
        return this;
    }

    /**
	 * With intressent id.
	 *
	 * @param value the value
	 * @return the vote data embedded id
	 */
    public VoteDataEmbeddedId withIntressentId(final String value) {
        setIntressentId(value);
        return this;
    }

    /**
	 * With concern.
	 *
	 * @param value the value
	 * @return the vote data embedded id
	 */
    public VoteDataEmbeddedId withConcern(final VoteIssueType value) {
        setConcern(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object);
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}