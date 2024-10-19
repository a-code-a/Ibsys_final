package com.example.supplychainmanagement.model;

import javax.xml.bind.annotation.XmlAttribute;

public class WorkingTime {
    private int station;
    private int shift;
    private int overtime;

    @XmlAttribute
    public int getStation() { return station; }
    public void setStation(int station) { this.station = station; }

    @XmlAttribute
    public int getShift() { return shift; }
    public void setShift(int shift) { this.shift = shift; }

    @XmlAttribute
    public int getOvertime() { return overtime; }
    public void setOvertime(int overtime) { this.overtime = overtime; }
}
