package com.sda.advanced.challenge;

public interface LaptopFactory {
     Processor  createProcessor();
    Storage createStorage(Storage storage);

}
