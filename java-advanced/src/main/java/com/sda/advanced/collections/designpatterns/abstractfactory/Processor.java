package com.sda.advanced.collections.designpatterns.abstractfactory;

public interface Processor {


    void attachStorage(Storage storage);
    void printSpecs();
}
