package com.sda.advanced.collections.designpatterns.builder.builder2;

import java.util.Optional;

public class ComputerBuilder {

    Computer computer;


    public ComputerBuilder withCpu(String cpu){
        this.computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder withHdd(String hdd){
        this.computer.setHdd(hdd);
        return this;
    }

    public Optional<ComputerBuilder> withGraphicsCard(String graphicsCard){
        this.computer.setGraphicsCard(graphicsCard);
        return Optional.of(this);
    }
}
