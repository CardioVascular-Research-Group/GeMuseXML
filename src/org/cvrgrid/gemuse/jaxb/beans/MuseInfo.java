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
 *         &lt;element ref="{}MuseVersion"/>
 *         &lt;element ref="{}RegisteredName"/>
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
    "museVersion",
    "registeredName"
})
@XmlRootElement(name = "MuseInfo")
public class MuseInfo {

    @XmlElement(name = "MuseVersion", required = true)
    protected String museVersion;
    @XmlElement(name = "RegisteredName", required = true)
    protected RegisteredName registeredName;

    /**
     * Gets the value of the museVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuseVersion() {
        return museVersion;
    }

    /**
     * Sets the value of the museVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuseVersion(String value) {
        this.museVersion = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredName }
     *     
     */
    public RegisteredName getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredName }
     *     
     */
    public void setRegisteredName(RegisteredName value) {
        this.registeredName = value;
    }

}
