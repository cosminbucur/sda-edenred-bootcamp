package com.sda.advanced.collections.designpatterns.abstractfactory;

public class HpLaptop {

    public Processor createProcessor(){
        return new HpProcessor();
    }

    public Storage createStorage(){
        return new HpStorage();
    }
}
