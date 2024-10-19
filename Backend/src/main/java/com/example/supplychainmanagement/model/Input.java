package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement(name = "input")
public class Input {
    private QualityControl qualityControl;
    private List<SellWish> sellWish;
    private List<SellDirect> sellDirect;
    private List<Order> orderList;
    private List<Production> productionList;
    private List<WorkingTime> workingTimeList;

    @XmlElement(name = "qualitycontrol")
    public QualityControl getQualityControl() { return qualityControl; }
    public void setQualityControl(QualityControl qualityControl) { this.qualityControl = qualityControl; }

    @XmlElement(name = "sellwish")
    public List<SellWish> getSellWish() { return sellWish; }
    public void setSellWish(List<SellWish> sellWish) { this.sellWish = sellWish; }

    @XmlElement(name = "selldirect")
    public List<SellDirect> getSellDirect() { return sellDirect; }
    public void setSellDirect(List<SellDirect> sellDirect) { this.sellDirect = sellDirect; }

    @XmlElement(name = "orderlist")
    public List<Order> getOrderList() { return orderList; }
    public void setOrderList(List<Order> orderList) { this.orderList = orderList; }

    @XmlElement(name = "productionlist")
    public List<Production> getProductionList() { return productionList; }
    public void setProductionList(List<Production> productionList) { this.productionList = productionList; }

    @XmlElement(name = "workingtimelist")
    public List<WorkingTime> getWorkingTimeList() { return workingTimeList; }
    public void setWorkingTimeList(List<WorkingTime> workingTimeList) { this.workingTimeList = workingTimeList; }
}
