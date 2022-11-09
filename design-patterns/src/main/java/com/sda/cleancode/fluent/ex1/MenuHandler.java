package com.sda.cleancode.fluent.ex1;

import java.util.ArrayList;
import java.util.List;

public class MenuHandler implements Menu {

    List<Item> menuList = new ArrayList<>();
    List<Item> selectedList = new ArrayList<>();

    public MenuHandler() {

    }

    @Override
    public Menu order(int index) {
        return null;
    }

    @Override
    public Menu eat() {
        return null;
    }

    @Override
    public Menu pay() {
        return null;
    }

    @Override
    public Item get(int index) {
        return null;
    }

    public void showMenu() {
        System.out.println("menu");
        for (Item item : menuList) {
            item.name();
        }
    }
}
