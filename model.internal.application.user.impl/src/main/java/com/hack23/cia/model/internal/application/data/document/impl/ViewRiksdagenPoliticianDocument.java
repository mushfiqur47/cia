//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.document.impl;


import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;


/**
 * <p>Java class for ViewRiksdagenPoliticianDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenPoliticianDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="madePublicDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberValue" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="rm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tempLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="roleDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referenceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyShortCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPoliticianDocument", propOrder = {
    "id",
    "docId",
    "documentType",
    "label",
    "madePublicDate",
    "org",
    "numberValue",
    "rm",
    "status",
    "subTitle",
    "subType",
    "tempLabel",
    "title",
    "roleDescription",
    "personReferenceId",
    "referenceName",
    "partyShortCode",
    "orderNumber"
})
@Entity(name = "ViewRiksdagenPoliticianDocument")
@Table(name = "VIEW_RIKSDAGEN_POLITICIAN_DOCUMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPoliticianDocument
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
    @XmlElement(required = true)
    protected String docId;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date madePublicDate;
    @XmlElement(required = true)
    protected String org;
    @XmlElement(required = true, nillable = true)
    protected BigInteger numberValue;
    @XmlElement(required = true)
    protected String rm;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String subTitle;
    @XmlElement(required = true)
    protected String subType;
    @XmlElement(required = true)
    protected String tempLabel;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String roleDescription;
    @XmlElement(required = true)
    protected String personReferenceId;
    @XmlElement(required = true)
    protected String referenceName;
    @XmlElement(required = true)
    protected String partyShortCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orderNumber;

    /**
     * Gets the value of the id property.
     * 
     */
    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(final long value) {
        this.id = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOC_ID")
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(final String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_TYPE")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(final String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LABEL")
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(final String value) {
        this.label = value;
    }

    /**
     * Gets the value of the madePublicDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MADE_PUBLIC_DATE")
    @Temporal(TemporalType.DATE)
    public Date getMadePublicDate() {
        return madePublicDate;
    }

    /**
     * Sets the value of the madePublicDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMadePublicDate(final Date value) {
        this.madePublicDate = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(final String value) {
        this.org = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "NUMBER_VALUE", precision = 20)
    public BigInteger getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberValue(final BigInteger value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the rm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RM")
    public String getRm() {
        return rm;
    }

    /**
     * Sets the value of the rm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRm(final String value) {
        this.rm = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(final String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUB_TITLE")
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(final String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUB_TYPE")
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(final String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the tempLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TEMP_LABEL")
    public String getTempLabel() {
        return tempLabel;
    }

    /**
     * Sets the value of the tempLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempLabel(final String value) {
        this.tempLabel = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(final String value) {
        this.title = value;
    }

    /**
     * Gets the value of the roleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROLE_DESCRIPTION")
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Sets the value of the roleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDescription(final String value) {
        this.roleDescription = value;
    }

    /**
     * Gets the value of the personReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PERSON_REFERENCE_ID")
    public String getPersonReferenceId() {
        return personReferenceId;
    }

    /**
     * Sets the value of the personReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonReferenceId(final String value) {
        this.personReferenceId = value;
    }

    /**
     * Gets the value of the referenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REFERENCE_NAME")
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * Sets the value of the referenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceName(final String value) {
        this.referenceName = value;
    }

    /**
     * Gets the value of the partyShortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY_SHORT_CODE")
    public String getPartyShortCode() {
        return partyShortCode;
    }

    /**
     * Sets the value of the partyShortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyShortCode(final String value) {
        this.partyShortCode = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "ORDER_NUMBER", precision = 10, scale = 0)
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNumber(final Integer value) {
        this.orderNumber = value;
    }

    public ViewRiksdagenPoliticianDocument withId(final long value) {
        setId(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withDocId(final String value) {
        setDocId(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withDocumentType(final String value) {
        setDocumentType(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withLabel(final String value) {
        setLabel(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withMadePublicDate(final Date value) {
        setMadePublicDate(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withOrg(final String value) {
        setOrg(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withNumberValue(final BigInteger value) {
        setNumberValue(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withRm(final String value) {
        setRm(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withStatus(final String value) {
        setStatus(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withSubTitle(final String value) {
        setSubTitle(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withSubType(final String value) {
        setSubType(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withTempLabel(final String value) {
        setTempLabel(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withTitle(final String value) {
        setTitle(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withRoleDescription(final String value) {
        setRoleDescription(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withPersonReferenceId(final String value) {
        setPersonReferenceId(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withReferenceName(final String value) {
        setReferenceName(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withPartyShortCode(final String value) {
        setPartyShortCode(value);
        return this;
    }

    public ViewRiksdagenPoliticianDocument withOrderNumber(final Integer value) {
        setOrderNumber(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}