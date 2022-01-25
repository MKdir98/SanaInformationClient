
package ir.iais.sana.services;

import ir.iais.sana.domain.sana.SanaRequestStatus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRequestsStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRequestsStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sanaRequestStatus" type="{http://servicebus.sana.ir/PushSana/v5/}sanaRequestStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequestsStatusResponse", propOrder = {
    "sanaRequestStatus"
})
public class GetRequestsStatusResponse {

    protected List<SanaRequestStatus> sanaRequestStatus;

    /**
     * Gets the value of the sanaRequestStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanaRequestStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanaRequestStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanaRequestStatus }
     * 
     * 
     */
    public List<SanaRequestStatus> getSanaRequestStatus() {
        if (sanaRequestStatus == null) {
            sanaRequestStatus = new ArrayList<SanaRequestStatus>();
        }
        return this.sanaRequestStatus;
    }

}
