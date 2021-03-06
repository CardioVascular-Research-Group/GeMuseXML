//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.09 at 11:46:28 AM EDT 
//


package org.cvrgrid.gemuse.jaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PatientID"/>
 *         &lt;element ref="{}AgeUnits"/>
 *         &lt;element ref="{}DateofBirth"/>
 *         &lt;element ref="{}Gender"/>
 *         &lt;element ref="{}Race"/>
 *         &lt;element ref="{}HeightIN"/>
 *         &lt;element ref="{}WeightLBS"/>
 *         &lt;element ref="{}PatientLastName"/>
 *         &lt;element ref="{}PatientFirstName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patientID",
    "ageUnits",
    "dateofBirth",
    "gender",
    "race",
    "heightIN",
    "weightLBS",
    "patientLastName",
    "patientFirstName"
})
@XmlRootElement(name = "PatientDemographics")
public class PatientDemographics {

    @XmlElement(name = "PatientID", required = true)
    protected String patientID;
    @XmlElement(name = "AgeUnits", required = true)
    protected String ageUnits;
    @XmlElement(name = "DateofBirth", required = true)
    protected String dateofBirth;
    @XmlElement(name = "Gender", required = true)
    protected String gender;
    @XmlElement(name = "Race", required = true)
    protected String race;
    @XmlElement(name = "HeightIN", required = true)
    protected String heightIN;
    @XmlElement(name = "WeightLBS", required = true)
    protected String weightLBS;
    @XmlElement(name = "PatientLastName", required = true)
    protected String patientLastName;
    @XmlElement(name = "PatientFirstName", required = true)
    protected String patientFirstName;

    /**
     * Gets the value of the patientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * Sets the value of the patientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientID(String value) {
        this.patientID = value;
    }

    /**
     * Gets the value of the ageUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeUnits() {
        return ageUnits;
    }

    /**
     * Sets the value of the ageUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeUnits(String value) {
        this.ageUnits = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateofBirth(String value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the heightIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightIN() {
        return heightIN;
    }

    /**
     * Sets the value of the heightIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightIN(String value) {
        this.heightIN = value;
    }

    /**
     * Gets the value of the weightLBS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightLBS() {
        return weightLBS;
    }

    /**
     * Sets the value of the weightLBS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightLBS(String value) {
        this.weightLBS = value;
    }

    /**
     * Gets the value of the patientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLastName() {
        return patientLastName;
    }

    /**
     * Sets the value of the patientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLastName(String value) {
        this.patientLastName = value;
    }

    /**
     * Gets the value of the patientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFirstName() {
        return patientFirstName;
    }

    /**
     * Sets the value of the patientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFirstName(String value) {
        this.patientFirstName = value;
    }

}
