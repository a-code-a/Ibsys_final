package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlAttribute;

public class QualityControl {
    private String type;
    private int delay;
    private int loseQuantity;

    @XmlAttribute
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @XmlAttribute
    public int getDelay() { return delay; }
    public void setDelay(int delay) { this.delay = delay; }

    @XmlAttribute(name = "losequantity")
    public int getLoseQuantity() { return loseQuantity; }
    public void setLoseQuantity(int loseQuantity) { this.loseQuantity = loseQuantity; }
}
