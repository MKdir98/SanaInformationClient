
package ir.iais.sana.services;

import ir.iais.sana.domain.sana.DetailedAccCode5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendDetailedAccCode5s complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendDetailedAccCode5s"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailedAccCode5s" type="{http://servicebus.sana.ir/PushSana/v5/}detailedAccCode5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sanaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendDetailedAccCode5s", propOrder = {
    "detailedAccCode5S",
    "sanaId"
})
public class SendDetailedAccCode5S {

    @XmlElement(name = "detailedAccCode5s")
    protected List<DetailedAccCode5> detailedAccCode5S;
    protected Long sanaId;

    /**
     * Gets the value of the detailedAccCode5S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedAccCode5S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedAccCode5S().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAccCode5 }
     * 
     * 
     */
    public List<DetailedAccCode5> getDetailedAccCode5S() {
        if (detailedAccCode5S == null) {
            detailedAccCode5S = new ArrayList<DetailedAccCode5>();
        }
        return this.detailedAccCode5S;
    }

    /**
     * Gets the value of the sanaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSanaId() {
        return sanaId;
    }

    /**
     * Sets the value of the sanaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSanaId(Long value) {
        this.sanaId = value;
    }

}
