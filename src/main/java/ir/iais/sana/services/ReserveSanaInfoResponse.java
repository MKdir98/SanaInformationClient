
package ir.iais.sana.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveSanaInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveSanaInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sanaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveSanaInfoResponse", propOrder = {
    "sanaId"
})
public class ReserveSanaInfoResponse {

    protected long sanaId;

    /**
     * Gets the value of the sanaId property.
     * 
     */
    public long getSanaId() {
        return sanaId;
    }

    /**
     * Sets the value of the sanaId property.
     * 
     */
    public void setSanaId(long value) {
        this.sanaId = value;
    }

}
