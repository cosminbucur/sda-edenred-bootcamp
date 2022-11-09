package com.sda.cleancode.fluent.ex1;

public interface Menu {
    Menu order(int index);

    Menu eat();

    Menu pay();

    Item get(int index);
}
