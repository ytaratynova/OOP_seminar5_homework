package ui;

import presenter.Presenter;

import java.util.Scanner;

import static java.lang.System.exit;

public class Console implements View{

    private Presenter presenter;
    private Scanner scanner;
    private Boolean Flag;
    private Menu menu;

    public Console() {
        scanner = new Scanner(System.in);
    }


    @Override
    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void start() {
        menu = new Menu(this);
        Flag = true;
        while(Flag){
            System.out.println("Выберите действие из списка: ");
            System.out.println(menu.printMenu());

            int choice = scanner.nextInt();
            menu.run(choice);
        }

    }


    public void addNote(){
        System.out.println("\nЧто внести в список покупок:");
        String product = scanner.next();
        presenter.addNote(product);
    }


    public void print(){
        System.out.println(presenter.print());
    }

}
