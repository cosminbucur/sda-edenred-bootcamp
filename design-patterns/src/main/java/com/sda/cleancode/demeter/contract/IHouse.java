package com.sda.cleancode.demeter.contract;

public interface IHouse {

    IAddress getAddress();

    String getColor();

    Double getSize();

    String getZipCode();
}
