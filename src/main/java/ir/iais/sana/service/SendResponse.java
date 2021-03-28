
package ir.iais.sana.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nextIndex" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendResponse", propOrder = {
    "nextIndex"
})
public class SendResponse
    implements Serializable
{

    protected long nextIndex;

    /**
     * Gets the value of the nextIndex property.
     * 
     */
    public long getNextIndex() {
        return nextIndex;
    }

    /**
     * Sets the value of the nextIndex property.
     * 
     */
    public void setNextIndex(long value) {
        this.nextIndex = value;
    }

}
