
package ir.iais.sana.services;

import ir.iais.sana.domain.sana.LedgerAccCode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendLedgerAccCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendLedgerAccCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ledgerAccCodes" type="{http://servicebus.sana.ir/PushSana/v5/}ledgerAccCode" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "sendLedgerAccCodes", propOrder = {
    "ledgerAccCodes",
    "sanaId"
})
public class SendLedgerAccCodes {

    protected List<LedgerAccCode> ledgerAccCodes;
    protected Long sanaId;

    /**
     * Gets the value of the ledgerAccCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ledgerAccCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLedgerAccCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LedgerAccCode }
     * 
     * 
     */
    public List<LedgerAccCode> getLedgerAccCodes() {
        if (ledgerAccCodes == null) {
            ledgerAccCodes = new ArrayList<LedgerAccCode>();
        }
        return this.ledgerAccCodes;
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
