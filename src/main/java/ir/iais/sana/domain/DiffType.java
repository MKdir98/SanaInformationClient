package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

public class DiffType implements Serializable {
    @XmlAttribute(name = "Value")
    private long value;
    @XmlElement(name = "Detail_List")
    private List<Detail> details;
    @XmlElement(name = "Attachment_List")
    private List<Attachment> attachments;
}
