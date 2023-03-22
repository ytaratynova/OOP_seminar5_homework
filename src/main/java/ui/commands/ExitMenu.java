package ui.commands;

import ui.Console;

import static java.lang.System.exit;

public class ExitMenu extends Command implements Options{

    public ExitMenu(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Завершить работу";
    }

    @Override
    public void run() {
        System.exit(0);

    }
}
