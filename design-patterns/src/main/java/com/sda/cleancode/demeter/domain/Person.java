package com.sda.cleancode.demeter.domain;

import com.sda.cleancode.demeter.contract.IHouse;
import com.sda.cleancode.demeter.contract.IPerson;

public class Person implements IPerson {

    private String name;
    private IHouse house;

    public Person(String name, IHouse house) {
        this.name = name;
        this.house = house;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IHouse getHouse() {
        return house;
    }

    @Override
    public String getZipCode() {
        return house.getZipCode();
    }
}
