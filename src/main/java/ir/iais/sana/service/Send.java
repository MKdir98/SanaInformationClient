
package ir.iais.sana.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for send complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="send"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataPart" type="{http://servicebus.sana.ir/PushSana/v4/}dataPart" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "send", propOrder = {
    "dataPart"
})
public class Send
    implements Serializable
{

    protected DataPart dataPart;

    /**
     * Gets the value of the dataPart property.
     * 
     * @return
     *     possible object is
     *     {@link DataPart }
     *     
     */
    public DataPart getDataPart() {
        return dataPart;
    }

    /**
     * Sets the value of the dataPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPart }
     *     
     */
    public void setDataPart(DataPart value) {
        this.dataPart = value;
    }

}
