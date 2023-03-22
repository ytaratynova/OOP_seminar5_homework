package ui.commands;

import ui.Console;

public class AllNotes extends Command implements Options{

    private Console console;
    public AllNotes(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Показать весь список";
    }

    @Override
    public void run() {
        getConsole().print();

    }
}
