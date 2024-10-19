package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlAttribute;

public class SellWish {
    private int article;
    private int quantity;

    @XmlAttribute
    public int getArticle() { return article; }
    public void setArticle(int article) { this.article = article; }

    @XmlAttribute
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
