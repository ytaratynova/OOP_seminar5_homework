package ui.commands;

import ui.Console;

public class AddNote extends Command implements Options {
    private Console console;

    public AddNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }

    @Override
    public void run() {
        getConsole().addNote();
    }
}

