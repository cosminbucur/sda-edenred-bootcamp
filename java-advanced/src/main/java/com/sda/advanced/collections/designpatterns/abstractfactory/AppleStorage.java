package com.sda.advanced.collections.designpatterns.abstractfactory;

public class AppleStorage implements Storage{

    private int storageSize;

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}
