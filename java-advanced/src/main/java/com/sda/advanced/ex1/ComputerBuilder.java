package com.sda.advanced.ex1;

public class ComputerBuilder {
    private Computer computer = new Computer();


    public void withCpu(String cpu){
        this.computer.setCpu(cpu);
    } public void withHdd(String hdd){
        this.computer.setHdd(hdd);
    } public void withGraphicsCar(String graphicsCard){
        this.computer.setCpu(graphicsCard);
    }

public Computer build(){
        return this.computer;
}

}
