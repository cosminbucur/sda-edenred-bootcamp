package com.sda.advanced.collections;

import java.rmi.server.ExportException;

public class SpeedExcededException extends RuntimeException {

    SpeedExcededException(String message){
        super(message);
    }

    SpeedExcededException(String message, RuntimeException cause){
        super(message, cause);
    }



}
