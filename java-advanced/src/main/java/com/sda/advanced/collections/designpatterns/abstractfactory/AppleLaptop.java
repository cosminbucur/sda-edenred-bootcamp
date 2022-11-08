package com.sda.advanced.collections.designpatterns.abstractfactory;

public class AppleLaptop {

    public Processor createProcessor(){
        return new AppleProcessor();
    }

    public Storage createStorage(){
        return new AppleStorage();
    }
}
