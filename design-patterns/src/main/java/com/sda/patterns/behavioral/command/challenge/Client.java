package com.sda.patterns.behavioral.command.challenge;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Vscode();
        Macro macro = new Macro();

//        macro.record(new Open(editor));
//        macro.record(new Save(editor));
//        macro.record(new Close(editor));

//        macro.record(() -> editor.open());
//        macro.record(() -> editor.save());
//        macro.record(() -> editor.close());

        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);

        macro.run();
    }
}
