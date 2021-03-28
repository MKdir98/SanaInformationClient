package ir.iais.sana.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

public class ContrastAccount implements Serializable {
    @XmlAttribute(name = "AccountNumber")
    private String accountNumber;
    @XmlAttribute(name = "AccountDscp")
    private String accountDscp;
    @XmlAttribute(name = "AccountType")
    private int accountType;
    @XmlAttribute(name = "MojoodiTebgheDaftar")
    private long mojoodiTebgheDaftar;
    @XmlAttribute(name = "MojoodiTebgheBank")
    private long mojoodiTebgheBank;
    @XmlElement(name = "AccountNumberImage")
    private AccountNumberImage accountNumberImage;
    @XmlElement(name = "DiffType1")
    private DiffType diffType1;
    @XmlElement(name = "DiffType2")
    private DiffType diffType2;
    @XmlElement(name = "DiffType3")
    private DiffType diffType3;
    @XmlElement(name = "DiffType4")
    private DiffType diffType4;
    @XmlElement(name = "DiffType5")
    private DiffType diffType5;
    @XmlElement(name = "DiffType6")
    private DiffType diffType6;
    @XmlElement(name = "DiffType7")
    private DiffType diffType7;
    @XmlElement(name = "DiffType8")
    private DiffType diffType8;
    @XmlElement(name = "DiffType9")
    private DiffType diffType9;
    @XmlElement(name = "DiffType10")
    private DiffType diffType10;
    @XmlElement(name = "DiffType11")
    private DiffType diffType11;
    @XmlElement(name = "DiffType12")
    private DiffType diffType12;
}
