package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlAttribute;

public class SellDirect {
    private int article;
    private int quantity;
    private double price;
    private double penalty;

    @XmlAttribute
    public int getArticle() { return article; }
    public void setArticle(int article) { this.article = article; }

    @XmlAttribute
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @XmlAttribute
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @XmlAttribute
    public double getPenalty() { return penalty; }
    public void setPenalty(double penalty) { this.penalty = penalty; }
}
