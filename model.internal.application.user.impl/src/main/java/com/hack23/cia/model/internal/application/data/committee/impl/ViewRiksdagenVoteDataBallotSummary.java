//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;
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
 * <p>Java class for ViewRiksdagenVoteDataBallotSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenVoteDataBallotSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://committee.data.application.internal.model.cia.hack23.com/impl}RiksdagenVoteDataBallotEmbeddedId"/&gt;
 *         &lt;element name="vote_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="rm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ballot_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="avg_born_year" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="total_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="yes_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="no_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="abstain_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="absent_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="no_winner" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_male" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenVoteDataBallotSummary", propOrder = {
    "embeddedId",
    "voteDate",
    "rm",
    "ballotType",
    "label",
    "avgBornYear",
    "totalVotes",
    "yesVotes",
    "noVotes",
    "abstainVotes",
    "absentVotes",
    "approved",
    "noWinner",
    "percentageYes",
    "percentageNo",
    "percentageAbsent",
    "percentageAbstain",
    "percentageMale"
})
@Entity(name = "ViewRiksdagenVoteDataBallotSummary")
@Table(name = "View_Riksdagen_Vote_Data_Ballot_Summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenVoteDataBallotSummary
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected RiksdagenVoteDataBallotEmbeddedId embeddedId;
    @XmlElement(name = "vote_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date voteDate;
    @XmlElement(required = true)
    protected String rm;
    @XmlElement(name = "ballot_type", required = true)
    protected String ballotType;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(name = "avg_born_year", required = true)
    protected BigDecimal avgBornYear;
    @XmlElement(name = "total_votes")
    protected long totalVotes;
    @XmlElement(name = "yes_votes")
    protected long yesVotes;
    @XmlElement(name = "no_votes")
    protected long noVotes;
    @XmlElement(name = "abstain_votes")
    protected long abstainVotes;
    @XmlElement(name = "absent_votes")
    protected long absentVotes;
    protected boolean approved;
    @XmlElement(name = "no_winner")
    protected boolean noWinner;
    @XmlElement(name = "percentage_yes", required = true)
    protected BigDecimal percentageYes;
    @XmlElement(name = "percentage_no", required = true)
    protected BigDecimal percentageNo;
    @XmlElement(name = "percentage_absent", required = true)
    protected BigDecimal percentageAbsent;
    @XmlElement(name = "percentage_abstain", required = true)
    protected BigDecimal percentageAbstain;
    @XmlElement(name = "percentage_male", required = true)
    protected BigDecimal percentageMale;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link RiksdagenVoteDataBallotEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "ballotId", column = @Column(name = "EMBEDDED_ID_BALLOT_ID", length = 255)),
        @AttributeOverride(name = "concern", column = @Column(name = "EMBEDDED_ID_CONCERN", length = 255)),
        @AttributeOverride(name = "issue", column = @Column(name = "EMBEDDED_ID_ISSUE", length = 255))
    })
    public RiksdagenVoteDataBallotEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiksdagenVoteDataBallotEmbeddedId }
     *     
     */
    public void setEmbeddedId(RiksdagenVoteDataBallotEmbeddedId value) {
        this.embeddedId = value;
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
    @Column(name = "VOTE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getVoteDate() {
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
    public void setVoteDate(Date value) {
        this.voteDate = value;
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
     * Gets the value of the ballotType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BALLOT_TYPE", length = 255)
    public String getBallotType() {
        return ballotType;
    }

    /**
     * Sets the value of the ballotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBallotType(String value) {
        this.ballotType = value;
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
     * Gets the value of the avgBornYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_BORN_YEAR", precision = 20, scale = 10)
    public BigDecimal getAvgBornYear() {
        return avgBornYear;
    }

    /**
     * Sets the value of the avgBornYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgBornYear(BigDecimal value) {
        this.avgBornYear = value;
    }

    /**
     * Gets the value of the totalVotes property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_VOTES", precision = 20, scale = 0)
    public long getTotalVotes() {
        return totalVotes;
    }

    /**
     * Sets the value of the totalVotes property.
     * 
     */
    public void setTotalVotes(long value) {
        this.totalVotes = value;
    }

    /**
     * Gets the value of the yesVotes property.
     * 
     */
    @Basic
    @Column(name = "YES_VOTES", precision = 20, scale = 0)
    public long getYesVotes() {
        return yesVotes;
    }

    /**
     * Sets the value of the yesVotes property.
     * 
     */
    public void setYesVotes(long value) {
        this.yesVotes = value;
    }

    /**
     * Gets the value of the noVotes property.
     * 
     */
    @Basic
    @Column(name = "NO_VOTES", precision = 20, scale = 0)
    public long getNoVotes() {
        return noVotes;
    }

    /**
     * Sets the value of the noVotes property.
     * 
     */
    public void setNoVotes(long value) {
        this.noVotes = value;
    }

    /**
     * Gets the value of the abstainVotes property.
     * 
     */
    @Basic
    @Column(name = "ABSTAIN_VOTES", precision = 20, scale = 0)
    public long getAbstainVotes() {
        return abstainVotes;
    }

    /**
     * Sets the value of the abstainVotes property.
     * 
     */
    public void setAbstainVotes(long value) {
        this.abstainVotes = value;
    }

    /**
     * Gets the value of the absentVotes property.
     * 
     */
    @Basic
    @Column(name = "ABSENT_VOTES", precision = 20, scale = 0)
    public long getAbsentVotes() {
        return absentVotes;
    }

    /**
     * Sets the value of the absentVotes property.
     * 
     */
    public void setAbsentVotes(long value) {
        this.absentVotes = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     */
    @Basic
    @Column(name = "APPROVED")
    public boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the noWinner property.
     * 
     */
    @Basic
    @Column(name = "NO_WINNER")
    public boolean isNoWinner() {
        return noWinner;
    }

    /**
     * Sets the value of the noWinner property.
     * 
     */
    public void setNoWinner(boolean value) {
        this.noWinner = value;
    }

    /**
     * Gets the value of the percentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getPercentageYes() {
        return percentageYes;
    }

    /**
     * Sets the value of the percentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageYes(BigDecimal value) {
        this.percentageYes = value;
    }

    /**
     * Gets the value of the percentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getPercentageNo() {
        return percentageNo;
    }

    /**
     * Sets the value of the percentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageNo(BigDecimal value) {
        this.percentageNo = value;
    }

    /**
     * Gets the value of the percentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getPercentageAbsent() {
        return percentageAbsent;
    }

    /**
     * Sets the value of the percentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbsent(BigDecimal value) {
        this.percentageAbsent = value;
    }

    /**
     * Gets the value of the percentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getPercentageAbstain() {
        return percentageAbstain;
    }

    /**
     * Sets the value of the percentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbstain(BigDecimal value) {
        this.percentageAbstain = value;
    }

    /**
     * Gets the value of the percentageMale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_MALE", precision = 20, scale = 10)
    public BigDecimal getPercentageMale() {
        return percentageMale;
    }

    /**
     * Sets the value of the percentageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageMale(BigDecimal value) {
        this.percentageMale = value;
    }

    public ViewRiksdagenVoteDataBallotSummary withEmbeddedId(RiksdagenVoteDataBallotEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withVoteDate(Date value) {
        setVoteDate(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withRm(String value) {
        setRm(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withBallotType(String value) {
        setBallotType(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withLabel(String value) {
        setLabel(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withAvgBornYear(BigDecimal value) {
        setAvgBornYear(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withTotalVotes(long value) {
        setTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withYesVotes(long value) {
        setYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withNoVotes(long value) {
        setNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withAbstainVotes(long value) {
        setAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withAbsentVotes(long value) {
        setAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withApproved(boolean value) {
        setApproved(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withNoWinner(boolean value) {
        setNoWinner(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withPercentageYes(BigDecimal value) {
        setPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withPercentageNo(BigDecimal value) {
        setPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withPercentageAbsent(BigDecimal value) {
        setPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withPercentageAbstain(BigDecimal value) {
        setPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummary withPercentageMale(BigDecimal value) {
        setPercentageMale(value);
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
            RiksdagenVoteDataBallotEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            strategy.appendField(locator, this, "embeddedId", buffer, theEmbeddedId);
        }
        {
            Date theVoteDate;
            theVoteDate = this.getVoteDate();
            strategy.appendField(locator, this, "voteDate", buffer, theVoteDate);
        }
        {
            String theRm;
            theRm = this.getRm();
            strategy.appendField(locator, this, "rm", buffer, theRm);
        }
        {
            String theBallotType;
            theBallotType = this.getBallotType();
            strategy.appendField(locator, this, "ballotType", buffer, theBallotType);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel);
        }
        {
            BigDecimal theAvgBornYear;
            theAvgBornYear = this.getAvgBornYear();
            strategy.appendField(locator, this, "avgBornYear", buffer, theAvgBornYear);
        }
        {
            long theTotalVotes;
            theTotalVotes = this.getTotalVotes();
            strategy.appendField(locator, this, "totalVotes", buffer, theTotalVotes);
        }
        {
            long theYesVotes;
            theYesVotes = this.getYesVotes();
            strategy.appendField(locator, this, "yesVotes", buffer, theYesVotes);
        }
        {
            long theNoVotes;
            theNoVotes = this.getNoVotes();
            strategy.appendField(locator, this, "noVotes", buffer, theNoVotes);
        }
        {
            long theAbstainVotes;
            theAbstainVotes = this.getAbstainVotes();
            strategy.appendField(locator, this, "abstainVotes", buffer, theAbstainVotes);
        }
        {
            long theAbsentVotes;
            theAbsentVotes = this.getAbsentVotes();
            strategy.appendField(locator, this, "absentVotes", buffer, theAbsentVotes);
        }
        {
            boolean theApproved;
            theApproved = this.isApproved();
            strategy.appendField(locator, this, "approved", buffer, theApproved);
        }
        {
            boolean theNoWinner;
            theNoWinner = this.isNoWinner();
            strategy.appendField(locator, this, "noWinner", buffer, theNoWinner);
        }
        {
            BigDecimal thePercentageYes;
            thePercentageYes = this.getPercentageYes();
            strategy.appendField(locator, this, "percentageYes", buffer, thePercentageYes);
        }
        {
            BigDecimal thePercentageNo;
            thePercentageNo = this.getPercentageNo();
            strategy.appendField(locator, this, "percentageNo", buffer, thePercentageNo);
        }
        {
            BigDecimal thePercentageAbsent;
            thePercentageAbsent = this.getPercentageAbsent();
            strategy.appendField(locator, this, "percentageAbsent", buffer, thePercentageAbsent);
        }
        {
            BigDecimal thePercentageAbstain;
            thePercentageAbstain = this.getPercentageAbstain();
            strategy.appendField(locator, this, "percentageAbstain", buffer, thePercentageAbstain);
        }
        {
            BigDecimal thePercentageMale;
            thePercentageMale = this.getPercentageMale();
            strategy.appendField(locator, this, "percentageMale", buffer, thePercentageMale);
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
        final ViewRiksdagenVoteDataBallotSummary that = ((ViewRiksdagenVoteDataBallotSummary) object);
        {
            RiksdagenVoteDataBallotEmbeddedId lhsEmbeddedId;
            lhsEmbeddedId = this.getEmbeddedId();
            RiksdagenVoteDataBallotEmbeddedId rhsEmbeddedId;
            rhsEmbeddedId = that.getEmbeddedId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "embeddedId", lhsEmbeddedId), LocatorUtils.property(thatLocator, "embeddedId", rhsEmbeddedId), lhsEmbeddedId, rhsEmbeddedId)) {
                return false;
            }
        }
        {
            Date lhsVoteDate;
            lhsVoteDate = this.getVoteDate();
            Date rhsVoteDate;
            rhsVoteDate = that.getVoteDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voteDate", lhsVoteDate), LocatorUtils.property(thatLocator, "voteDate", rhsVoteDate), lhsVoteDate, rhsVoteDate)) {
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
            String lhsBallotType;
            lhsBallotType = this.getBallotType();
            String rhsBallotType;
            rhsBallotType = that.getBallotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotType", lhsBallotType), LocatorUtils.property(thatLocator, "ballotType", rhsBallotType), lhsBallotType, rhsBallotType)) {
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
            BigDecimal lhsAvgBornYear;
            lhsAvgBornYear = this.getAvgBornYear();
            BigDecimal rhsAvgBornYear;
            rhsAvgBornYear = that.getAvgBornYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgBornYear", lhsAvgBornYear), LocatorUtils.property(thatLocator, "avgBornYear", rhsAvgBornYear), lhsAvgBornYear, rhsAvgBornYear)) {
                return false;
            }
        }
        {
            long lhsTotalVotes;
            lhsTotalVotes = this.getTotalVotes();
            long rhsTotalVotes;
            rhsTotalVotes = that.getTotalVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalVotes", lhsTotalVotes), LocatorUtils.property(thatLocator, "totalVotes", rhsTotalVotes), lhsTotalVotes, rhsTotalVotes)) {
                return false;
            }
        }
        {
            long lhsYesVotes;
            lhsYesVotes = this.getYesVotes();
            long rhsYesVotes;
            rhsYesVotes = that.getYesVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yesVotes", lhsYesVotes), LocatorUtils.property(thatLocator, "yesVotes", rhsYesVotes), lhsYesVotes, rhsYesVotes)) {
                return false;
            }
        }
        {
            long lhsNoVotes;
            lhsNoVotes = this.getNoVotes();
            long rhsNoVotes;
            rhsNoVotes = that.getNoVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noVotes", lhsNoVotes), LocatorUtils.property(thatLocator, "noVotes", rhsNoVotes), lhsNoVotes, rhsNoVotes)) {
                return false;
            }
        }
        {
            long lhsAbstainVotes;
            lhsAbstainVotes = this.getAbstainVotes();
            long rhsAbstainVotes;
            rhsAbstainVotes = that.getAbstainVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstainVotes", lhsAbstainVotes), LocatorUtils.property(thatLocator, "abstainVotes", rhsAbstainVotes), lhsAbstainVotes, rhsAbstainVotes)) {
                return false;
            }
        }
        {
            long lhsAbsentVotes;
            lhsAbsentVotes = this.getAbsentVotes();
            long rhsAbsentVotes;
            rhsAbsentVotes = that.getAbsentVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "absentVotes", lhsAbsentVotes), LocatorUtils.property(thatLocator, "absentVotes", rhsAbsentVotes), lhsAbsentVotes, rhsAbsentVotes)) {
                return false;
            }
        }
        {
            boolean lhsApproved;
            lhsApproved = this.isApproved();
            boolean rhsApproved;
            rhsApproved = that.isApproved();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approved", lhsApproved), LocatorUtils.property(thatLocator, "approved", rhsApproved), lhsApproved, rhsApproved)) {
                return false;
            }
        }
        {
            boolean lhsNoWinner;
            lhsNoWinner = this.isNoWinner();
            boolean rhsNoWinner;
            rhsNoWinner = that.isNoWinner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noWinner", lhsNoWinner), LocatorUtils.property(thatLocator, "noWinner", rhsNoWinner), lhsNoWinner, rhsNoWinner)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageYes;
            lhsPercentageYes = this.getPercentageYes();
            BigDecimal rhsPercentageYes;
            rhsPercentageYes = that.getPercentageYes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageYes", lhsPercentageYes), LocatorUtils.property(thatLocator, "percentageYes", rhsPercentageYes), lhsPercentageYes, rhsPercentageYes)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageNo;
            lhsPercentageNo = this.getPercentageNo();
            BigDecimal rhsPercentageNo;
            rhsPercentageNo = that.getPercentageNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageNo", lhsPercentageNo), LocatorUtils.property(thatLocator, "percentageNo", rhsPercentageNo), lhsPercentageNo, rhsPercentageNo)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageAbsent;
            lhsPercentageAbsent = this.getPercentageAbsent();
            BigDecimal rhsPercentageAbsent;
            rhsPercentageAbsent = that.getPercentageAbsent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageAbsent", lhsPercentageAbsent), LocatorUtils.property(thatLocator, "percentageAbsent", rhsPercentageAbsent), lhsPercentageAbsent, rhsPercentageAbsent)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageAbstain;
            lhsPercentageAbstain = this.getPercentageAbstain();
            BigDecimal rhsPercentageAbstain;
            rhsPercentageAbstain = that.getPercentageAbstain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageAbstain", lhsPercentageAbstain), LocatorUtils.property(thatLocator, "percentageAbstain", rhsPercentageAbstain), lhsPercentageAbstain, rhsPercentageAbstain)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageMale;
            lhsPercentageMale = this.getPercentageMale();
            BigDecimal rhsPercentageMale;
            rhsPercentageMale = that.getPercentageMale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageMale", lhsPercentageMale), LocatorUtils.property(thatLocator, "percentageMale", rhsPercentageMale), lhsPercentageMale, rhsPercentageMale)) {
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
            RiksdagenVoteDataBallotEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "embeddedId", theEmbeddedId), currentHashCode, theEmbeddedId);
        }
        {
            Date theVoteDate;
            theVoteDate = this.getVoteDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voteDate", theVoteDate), currentHashCode, theVoteDate);
        }
        {
            String theRm;
            theRm = this.getRm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rm", theRm), currentHashCode, theRm);
        }
        {
            String theBallotType;
            theBallotType = this.getBallotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ballotType", theBallotType), currentHashCode, theBallotType);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            BigDecimal theAvgBornYear;
            theAvgBornYear = this.getAvgBornYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avgBornYear", theAvgBornYear), currentHashCode, theAvgBornYear);
        }
        {
            long theTotalVotes;
            theTotalVotes = this.getTotalVotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalVotes", theTotalVotes), currentHashCode, theTotalVotes);
        }
        {
            long theYesVotes;
            theYesVotes = this.getYesVotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "yesVotes", theYesVotes), currentHashCode, theYesVotes);
        }
        {
            long theNoVotes;
            theNoVotes = this.getNoVotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noVotes", theNoVotes), currentHashCode, theNoVotes);
        }
        {
            long theAbstainVotes;
            theAbstainVotes = this.getAbstainVotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abstainVotes", theAbstainVotes), currentHashCode, theAbstainVotes);
        }
        {
            long theAbsentVotes;
            theAbsentVotes = this.getAbsentVotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "absentVotes", theAbsentVotes), currentHashCode, theAbsentVotes);
        }
        {
            boolean theApproved;
            theApproved = this.isApproved();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approved", theApproved), currentHashCode, theApproved);
        }
        {
            boolean theNoWinner;
            theNoWinner = this.isNoWinner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noWinner", theNoWinner), currentHashCode, theNoWinner);
        }
        {
            BigDecimal thePercentageYes;
            thePercentageYes = this.getPercentageYes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageYes", thePercentageYes), currentHashCode, thePercentageYes);
        }
        {
            BigDecimal thePercentageNo;
            thePercentageNo = this.getPercentageNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageNo", thePercentageNo), currentHashCode, thePercentageNo);
        }
        {
            BigDecimal thePercentageAbsent;
            thePercentageAbsent = this.getPercentageAbsent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageAbsent", thePercentageAbsent), currentHashCode, thePercentageAbsent);
        }
        {
            BigDecimal thePercentageAbstain;
            thePercentageAbstain = this.getPercentageAbstain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageAbstain", thePercentageAbstain), currentHashCode, thePercentageAbstain);
        }
        {
            BigDecimal thePercentageMale;
            thePercentageMale = this.getPercentageMale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageMale", thePercentageMale), currentHashCode, thePercentageMale);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}