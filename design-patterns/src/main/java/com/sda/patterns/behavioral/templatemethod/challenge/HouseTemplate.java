package com.sda.patterns.behavioral.templatemethod.challenge;

public abstract class HouseTemplate {

    // template method, final so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildWindows();
        buildWalls();
        buildPillars();
        System.out.println("House is built.");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    // methods to be implemented by subclasses

    // default implementation
    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
}
