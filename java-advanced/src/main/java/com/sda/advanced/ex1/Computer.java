package com.sda.advanced.ex1;

public class Computer {
    private  String cpu;
    private  String hdd;
    //optional
    private  String graphicsCard;

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Computer() {
    }
}
