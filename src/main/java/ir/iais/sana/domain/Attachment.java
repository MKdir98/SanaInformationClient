package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlType(name = "Attachment_List ")
public class Attachment implements Serializable {
    @XmlAttribute(name = "Attachment")
    private byte[] attachment;
    @XmlAttribute(name = "Extension")
    private String extension;
    @XmlAttribute(name = "Description")
    private String description;
    @XmlAttribute(name = "AttachmentType")
    private int attachmentType;
}
