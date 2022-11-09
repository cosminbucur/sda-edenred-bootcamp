package com.sda.cleancode.demeter.domain;

import com.sda.cleancode.demeter.contract.IAddress;
import com.sda.cleancode.demeter.contract.IHouse;

public class House implements IHouse {

    private IAddress address;
    private String color;
    private Double size;

    public House(IAddress address, String color, Double size) {
        this.address = address;
        this.color = color;
        this.size = size;
    }

    @Override
    public IAddress getAddress() {
        return address;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Double getSize() {
        return size;
    }

    @Override
    public String getZipCode() {
        return address.getZipCode();
    }
}
