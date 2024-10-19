package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Order {
    private int article;
    private int quantity;
    private int modus;

    @XmlAttribute
    public int getArticle() { return article; }
    public void setArticle(int article) { this.article = article; }

    @XmlAttribute
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @XmlAttribute
    public int getModus() { return modus; }
    public void setModus(int modus) { this.modus = modus; }
}
