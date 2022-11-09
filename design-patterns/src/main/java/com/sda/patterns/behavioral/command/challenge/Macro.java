package com.sda.patterns.behavioral.command.challenge;

import java.util.ArrayList;
import java.util.List;

public class Macro {

    private final List<Action> actions = new ArrayList<>();

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
