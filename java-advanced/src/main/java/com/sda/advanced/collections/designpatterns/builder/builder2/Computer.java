package com.sda.advanced.collections.designpatterns.builder.builder2;

public class Computer {

    private String cpu;
    private String hdd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    private String graphicsCard;

    private Computer(ComputerBuilder builder){

    }

    public Computer build(){
        return this;
    }
}
