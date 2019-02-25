//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:13 PM CET 
//


package com.hack23.cia.model.external.riksdagen.votering.impl;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.hack23.cia.model.common.api.ModelObject;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for VoteDataDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoteDataDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="avser" type="{http://votering.riksdagen.external.model.cia.hack23.com/impl}VoteIssueType"/&gt;
 *         &lt;element name="banknummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beteckning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="efternamn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fodd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fornamn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intressent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="punkt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rost" type="{http://votering.riksdagen.external.model.cia.hack23.com/impl}VoteDecision"/&gt;
 *         &lt;element name="votering" type="{http://votering.riksdagen.external.model.cia.hack23.com/impl}BallotType"/&gt;
 *         &lt;element name="valkrets" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valkretsnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="votering_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDataDto", propOrder = {
    "concern",
    "bankNumber",
    "label",
    "lastName",
    "bornYear",
    "firstName",
    "intressentId",
    "place",
    "gender",
    "fullName",
    "party",
    "issue",
    "rm",
    "vote",
    "ballotType",
    "electoralRegion",
    "electoralRegionNumber",
    "ballotId",
    "voteDate"
})
@Entity(name = "VoteDataDto")
@Table(name = "VOTE_DATA_DTO")
@IdClass(VoteDataDtoId.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class VoteDataDto
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(name = "avser", required = true)
    @XmlSchemaType(name = "string")
    protected VoteIssueType concern;
    @XmlElement(name = "banknummer", required = true)
    protected String bankNumber;
    @XmlElement(name = "beteckning", required = true)
    protected String label;
    @XmlElement(name = "efternamn", required = true)
    protected String lastName;
    @XmlElement(name = "fodd")
    protected int bornYear;
    @XmlElement(name = "fornamn", required = true)
    protected String firstName;
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    @XmlElement(name = "iort", required = true)
    protected String place;
    @XmlElement(name = "kon", required = true)
    protected String gender;
    @XmlElement(name = "namn", required = true)
    protected String fullName;
    @XmlElement(name = "parti", required = true)
    protected String party;
    @XmlElement(name = "punkt", required = true)
    protected String issue;
    @XmlElement(required = true)
    protected String rm;
    @XmlElement(name = "rost", required = true)
    @XmlSchemaType(name = "string")
    protected VoteDecision vote;
    @XmlElement(name = "votering", required = true)
    @XmlSchemaType(name = "string")
    protected BallotType ballotType;
    @XmlElement(name = "valkrets", required = true)
    protected String electoralRegion;
    @XmlElement(name = "valkretsnummer", required = true)
    protected BigInteger electoralRegionNumber;
    @XmlElement(name = "votering_id", required = true)
    protected String ballotId;
    @XmlElement(name = "datum", required = true)
    protected String voteDate;

    /**
     * Gets the value of the concern property.
     * 
     * @return
     *     possible object is
     *     {@link VoteIssueType }
     *     
     */
    @Basic
    @Column(name = "CONCERN", length = 255)
    @Enumerated(EnumType.STRING)
    public VoteIssueType getConcern() {
        return concern;
    }

    /**
     * Sets the value of the concern property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteIssueType }
     *     
     */
    public void setConcern(VoteIssueType value) {
        this.concern = value;
    }

    /**
     * Gets the value of the bankNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BANK_NUMBER", length = 255)
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * Sets the value of the bankNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNumber(String value) {
        this.bankNumber = value;
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
    @Column(name = "LABEL", length = 255)
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
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_NAME", length = 255)
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the bornYear property.
     * 
     */
    @Basic
    @Column(name = "BORN_YEAR", precision = 10, scale = 0)
    public int getBornYear() {
        return bornYear;
    }

    /**
     * Sets the value of the bornYear property.
     * 
     */
    public void setBornYear(int value) {
        this.bornYear = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME", length = 255)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the intressentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
     * Sets the value of the intressentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntressentId(String value) {
        this.intressentId = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PLACE", length = 255)
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GENDER", length = 255)
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FULL_NAME", length = 255)
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY", length = 255)
    public String getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParty(String value) {
        this.party = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ISSUE")
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
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
    @Column(name = "RM", length = 255)
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
    public void setRm(String value) {
        this.rm = value;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteDecision }
     *     
     */
    @Basic
    @Column(name = "VOTE", length = 255)
    @Enumerated(EnumType.STRING)
    public VoteDecision getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteDecision }
     *     
     */
    public void setVote(VoteDecision value) {
        this.vote = value;
    }

    /**
     * Gets the value of the ballotType property.
     * 
     * @return
     *     possible object is
     *     {@link BallotType }
     *     
     */
    @Basic
    @Column(name = "BALLOT_TYPE", length = 255)
    @Enumerated(EnumType.STRING)
    public BallotType getBallotType() {
        return ballotType;
    }

    /**
     * Sets the value of the ballotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BallotType }
     *     
     */
    public void setBallotType(BallotType value) {
        this.ballotType = value;
    }

    /**
     * Gets the value of the electoralRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELECTORAL_REGION", length = 255)
    public String getElectoralRegion() {
        return electoralRegion;
    }

    /**
     * Sets the value of the electoralRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectoralRegion(String value) {
        this.electoralRegion = value;
    }

    /**
     * Gets the value of the electoralRegionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "ELECTORAL_REGION_NUMBER", precision = 20, scale = 0)
    public BigInteger getElectoralRegionNumber() {
        return electoralRegionNumber;
    }

    /**
     * Sets the value of the electoralRegionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElectoralRegionNumber(BigInteger value) {
        this.electoralRegionNumber = value;
    }

    /**
     * Gets the value of the ballotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "BALLOT_ID")
    public String getBallotId() {
        return ballotId;
    }

    /**
     * Sets the value of the ballotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBallotId(String value) {
        this.ballotId = value;
    }

    /**
     * Gets the value of the voteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VOTE_DATE", length = 255)
    public String getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the value of the voteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteDate(String value) {
        this.voteDate = value;
    }

    public VoteDataDto withConcern(VoteIssueType value) {
        setConcern(value);
        return this;
    }

    public VoteDataDto withBankNumber(String value) {
        setBankNumber(value);
        return this;
    }

    public VoteDataDto withLabel(String value) {
        setLabel(value);
        return this;
    }

    public VoteDataDto withLastName(String value) {
        setLastName(value);
        return this;
    }

    public VoteDataDto withBornYear(int value) {
        setBornYear(value);
        return this;
    }

    public VoteDataDto withFirstName(String value) {
        setFirstName(value);
        return this;
    }

    public VoteDataDto withIntressentId(String value) {
        setIntressentId(value);
        return this;
    }

    public VoteDataDto withPlace(String value) {
        setPlace(value);
        return this;
    }

    public VoteDataDto withGender(String value) {
        setGender(value);
        return this;
    }

    public VoteDataDto withFullName(String value) {
        setFullName(value);
        return this;
    }

    public VoteDataDto withParty(String value) {
        setParty(value);
        return this;
    }

    public VoteDataDto withIssue(String value) {
        setIssue(value);
        return this;
    }

    public VoteDataDto withRm(String value) {
        setRm(value);
        return this;
    }

    public VoteDataDto withVote(VoteDecision value) {
        setVote(value);
        return this;
    }

    public VoteDataDto withBallotType(BallotType value) {
        setBallotType(value);
        return this;
    }

    public VoteDataDto withElectoralRegion(String value) {
        setElectoralRegion(value);
        return this;
    }

    public VoteDataDto withElectoralRegionNumber(BigInteger value) {
        setElectoralRegionNumber(value);
        return this;
    }

    public VoteDataDto withBallotId(String value) {
        setBallotId(value);
        return this;
    }

    public VoteDataDto withVoteDate(String value) {
        setVoteDate(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            VoteIssueType theConcern;
            theConcern = this.getConcern();
            strategy.appendField(locator, this, "concern", buffer, theConcern);
        }
        {
            String theBankNumber;
            theBankNumber = this.getBankNumber();
            strategy.appendField(locator, this, "bankNumber", buffer, theBankNumber);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            strategy.appendField(locator, this, "lastName", buffer, theLastName);
        }
        {
            int theBornYear;
            theBornYear = this.getBornYear();
            strategy.appendField(locator, this, "bornYear", buffer, theBornYear);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            strategy.appendField(locator, this, "intressentId", buffer, theIntressentId);
        }
        {
            String thePlace;
            thePlace = this.getPlace();
            strategy.appendField(locator, this, "place", buffer, thePlace);
        }
        {
            String theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            String theFullName;
            theFullName = this.getFullName();
            strategy.appendField(locator, this, "fullName", buffer, theFullName);
        }
        {
            String theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty);
        }
        {
            String theIssue;
            theIssue = this.getIssue();
            strategy.appendField(locator, this, "issue", buffer, theIssue);
        }
        {
            String theRm;
            theRm = this.getRm();
            strategy.appendField(locator, this, "rm", buffer, theRm);
        }
        {
            VoteDecision theVote;
            theVote = this.getVote();
            strategy.appendField(locator, this, "vote", buffer, theVote);
        }
        {
            BallotType theBallotType;
            theBallotType = this.getBallotType();
            strategy.appendField(locator, this, "ballotType", buffer, theBallotType);
        }
        {
            String theElectoralRegion;
            theElectoralRegion = this.getElectoralRegion();
            strategy.appendField(locator, this, "electoralRegion", buffer, theElectoralRegion);
        }
        {
            BigInteger theElectoralRegionNumber;
            theElectoralRegionNumber = this.getElectoralRegionNumber();
            strategy.appendField(locator, this, "electoralRegionNumber", buffer, theElectoralRegionNumber);
        }
        {
            String theBallotId;
            theBallotId = this.getBallotId();
            strategy.appendField(locator, this, "ballotId", buffer, theBallotId);
        }
        {
            String theVoteDate;
            theVoteDate = this.getVoteDate();
            strategy.appendField(locator, this, "voteDate", buffer, theVoteDate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VoteDataDto that = ((VoteDataDto) object);
        {
            VoteIssueType lhsConcern;
            lhsConcern = this.getConcern();
            VoteIssueType rhsConcern;
            rhsConcern = that.getConcern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concern", lhsConcern), LocatorUtils.property(thatLocator, "concern", rhsConcern), lhsConcern, rhsConcern)) {
                return false;
            }
        }
        {
            String lhsBankNumber;
            lhsBankNumber = this.getBankNumber();
            String rhsBankNumber;
            rhsBankNumber = that.getBankNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankNumber", lhsBankNumber), LocatorUtils.property(thatLocator, "bankNumber", rhsBankNumber), lhsBankNumber, rhsBankNumber)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            int lhsBornYear;
            lhsBornYear = this.getBornYear();
            int rhsBornYear;
            rhsBornYear = that.getBornYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornYear", lhsBornYear), LocatorUtils.property(thatLocator, "bornYear", rhsBornYear), lhsBornYear, rhsBornYear)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsIntressentId;
            lhsIntressentId = this.getIntressentId();
            String rhsIntressentId;
            rhsIntressentId = that.getIntressentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intressentId", lhsIntressentId), LocatorUtils.property(thatLocator, "intressentId", rhsIntressentId), lhsIntressentId, rhsIntressentId)) {
                return false;
            }
        }
        {
            String lhsPlace;
            lhsPlace = this.getPlace();
            String rhsPlace;
            rhsPlace = that.getPlace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "place", lhsPlace), LocatorUtils.property(thatLocator, "place", rhsPlace), lhsPlace, rhsPlace)) {
                return false;
            }
        }
        {
            String lhsGender;
            lhsGender = this.getGender();
            String rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            String lhsFullName;
            lhsFullName = this.getFullName();
            String rhsFullName;
            rhsFullName = that.getFullName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullName", lhsFullName), LocatorUtils.property(thatLocator, "fullName", rhsFullName), lhsFullName, rhsFullName)) {
                return false;
            }
        }
        {
            String lhsParty;
            lhsParty = this.getParty();
            String rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty)) {
                return false;
            }
        }
        {
            String lhsIssue;
            lhsIssue = this.getIssue();
            String rhsIssue;
            rhsIssue = that.getIssue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issue", lhsIssue), LocatorUtils.property(thatLocator, "issue", rhsIssue), lhsIssue, rhsIssue)) {
                return false;
            }
        }
        {
            String lhsRm;
            lhsRm = this.getRm();
            String rhsRm;
            rhsRm = that.getRm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rm", lhsRm), LocatorUtils.property(thatLocator, "rm", rhsRm), lhsRm, rhsRm)) {
                return false;
            }
        }
        {
            VoteDecision lhsVote;
            lhsVote = this.getVote();
            VoteDecision rhsVote;
            rhsVote = that.getVote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vote", lhsVote), LocatorUtils.property(thatLocator, "vote", rhsVote), lhsVote, rhsVote)) {
                return false;
            }
        }
        {
            BallotType lhsBallotType;
            lhsBallotType = this.getBallotType();
            BallotType rhsBallotType;
            rhsBallotType = that.getBallotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotType", lhsBallotType), LocatorUtils.property(thatLocator, "ballotType", rhsBallotType), lhsBallotType, rhsBallotType)) {
                return false;
            }
        }
        {
            String lhsElectoralRegion;
            lhsElectoralRegion = this.getElectoralRegion();
            String rhsElectoralRegion;
            rhsElectoralRegion = that.getElectoralRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electoralRegion", lhsElectoralRegion), LocatorUtils.property(thatLocator, "electoralRegion", rhsElectoralRegion), lhsElectoralRegion, rhsElectoralRegion)) {
                return false;
            }
        }
        {
            BigInteger lhsElectoralRegionNumber;
            lhsElectoralRegionNumber = this.getElectoralRegionNumber();
            BigInteger rhsElectoralRegionNumber;
            rhsElectoralRegionNumber = that.getElectoralRegionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electoralRegionNumber", lhsElectoralRegionNumber), LocatorUtils.property(thatLocator, "electoralRegionNumber", rhsElectoralRegionNumber), lhsElectoralRegionNumber, rhsElectoralRegionNumber)) {
                return false;
            }
        }
        {
            String lhsBallotId;
            lhsBallotId = this.getBallotId();
            String rhsBallotId;
            rhsBallotId = that.getBallotId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotId", lhsBallotId), LocatorUtils.property(thatLocator, "ballotId", rhsBallotId), lhsBallotId, rhsBallotId)) {
                return false;
            }
        }
        {
            String lhsVoteDate;
            lhsVoteDate = this.getVoteDate();
            String rhsVoteDate;
            rhsVoteDate = that.getVoteDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voteDate", lhsVoteDate), LocatorUtils.property(thatLocator, "voteDate", rhsVoteDate), lhsVoteDate, rhsVoteDate)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            VoteIssueType theConcern;
            theConcern = this.getConcern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concern", theConcern), currentHashCode, theConcern);
        }
        {
            String theBankNumber;
            theBankNumber = this.getBankNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankNumber", theBankNumber), currentHashCode, theBankNumber);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            int theBornYear;
            theBornYear = this.getBornYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bornYear", theBornYear), currentHashCode, theBornYear);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intressentId", theIntressentId), currentHashCode, theIntressentId);
        }
        {
            String thePlace;
            thePlace = this.getPlace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "place", thePlace), currentHashCode, thePlace);
        }
        {
            String theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            String theFullName;
            theFullName = this.getFullName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullName", theFullName), currentHashCode, theFullName);
        }
        {
            String theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty);
        }
        {
            String theIssue;
            theIssue = this.getIssue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issue", theIssue), currentHashCode, theIssue);
        }
        {
            String theRm;
            theRm = this.getRm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rm", theRm), currentHashCode, theRm);
        }
        {
            VoteDecision theVote;
            theVote = this.getVote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vote", theVote), currentHashCode, theVote);
        }
        {
            BallotType theBallotType;
            theBallotType = this.getBallotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ballotType", theBallotType), currentHashCode, theBallotType);
        }
        {
            String theElectoralRegion;
            theElectoralRegion = this.getElectoralRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electoralRegion", theElectoralRegion), currentHashCode, theElectoralRegion);
        }
        {
            BigInteger theElectoralRegionNumber;
            theElectoralRegionNumber = this.getElectoralRegionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electoralRegionNumber", theElectoralRegionNumber), currentHashCode, theElectoralRegionNumber);
        }
        {
            String theBallotId;
            theBallotId = this.getBallotId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ballotId", theBallotId), currentHashCode, theBallotId);
        }
        {
            String theVoteDate;
            theVoteDate = this.getVoteDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voteDate", theVoteDate), currentHashCode, theVoteDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}