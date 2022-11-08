package com.sda.advanced.challenge;

public class HpLaptop implements LaptopFactory {
    public Processor createProcessor(){
        return new Processor() {
            @Override
            public void attachStorage(Storage storage) {

            }

            @Override
            public void printSpecs() {

            }
        };

    }

    @Override
    public Storage createStorage(Storage storage) {
        return null;
    }

    public Storage createStorage(){
        return new Storage() {
            @Override
            public void getType() {

            }
        };
    }
}
