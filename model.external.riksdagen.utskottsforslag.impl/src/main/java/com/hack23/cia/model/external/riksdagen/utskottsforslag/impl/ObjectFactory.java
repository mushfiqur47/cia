//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:10 PM CET 
//


package com.hack23.cia.model.external.riksdagen.utskottsforslag.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hack23.cia.model.external.riksdagen.utskottsforslag.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Utskottsforslag_QNAME = new QName("http://utskottsforslag.riksdagen.external.model.cia.hack23.com/impl", "utskottsforslag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hack23.cia.model.external.riksdagen.utskottsforslag.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CommitteeProposalComponentData }
     * 
     */
    public CommitteeProposalComponentData createCommitteeProposalComponentData() {
        return new CommitteeProposalComponentData();
    }

    /**
     * Create an instance of {@link CommitteeDocumentData }
     * 
     */
    public CommitteeDocumentData createCommitteeDocumentData() {
        return new CommitteeDocumentData();
    }

    /**
     * Create an instance of {@link AgainstProposalContainer }
     * 
     */
    public AgainstProposalContainer createAgainstProposalContainer() {
        return new AgainstProposalContainer();
    }

    /**
     * Create an instance of {@link AgainstProposalData }
     * 
     */
    public AgainstProposalData createAgainstProposalData() {
        return new AgainstProposalData();
    }

    /**
     * Create an instance of {@link CommitteeProposalContainer }
     * 
     */
    public CommitteeProposalContainer createCommitteeProposalContainer() {
        return new CommitteeProposalContainer();
    }

    /**
     * Create an instance of {@link CommitteeProposalData }
     * 
     */
    public CommitteeProposalData createCommitteeProposalData() {
        return new CommitteeProposalData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitteeProposalComponentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://utskottsforslag.riksdagen.external.model.cia.hack23.com/impl", name = "utskottsforslag")
    public JAXBElement<CommitteeProposalComponentData> createUtskottsforslag(CommitteeProposalComponentData value) {
        return new JAXBElement<CommitteeProposalComponentData>(_Utskottsforslag_QNAME, CommitteeProposalComponentData.class, null, value);
    }

}