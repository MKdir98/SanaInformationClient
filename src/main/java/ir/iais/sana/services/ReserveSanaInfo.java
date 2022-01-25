
package ir.iais.sana.services;

import ir.iais.sana.domain.sana.ProtocolId;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveSanaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveSanaInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="protocolId" type="{http://servicebus.sana.ir/PushSana/v5/}protocolId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveSanaInfo", propOrder = {
    "protocolId"
})
public class ReserveSanaInfo {

    protected ProtocolId protocolId;

    /**
     * Gets the value of the protocolId property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolId }
     *     
     */
    public ProtocolId getProtocolId() {
        return protocolId;
    }

    /**
     * Sets the value of the protocolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolId }
     *     
     */
    public void setProtocolId(ProtocolId value) {
        this.protocolId = value;
    }

}
