/*
* Все материалы прикреплены в описанию урока. к сожалению к материалам урока не получилось)
* Создать в формате MVP проект блокнот. Суть: пользователь может делать какие-то записи для себя
* (список продуктов или запись к врачу, не важно, просто текст, который надо сохранить).
* Приложение сохраняет эти записи и при просьбе пользователя может выдавать список всех записей.
* Сохранять можно в обычный список (например ArrayList) или в файл*.
* Все общение с пользователем должно быть во view части проекта.
* Можно построить диалог с пользователем по типу: выберите команду: 1- добавить фразу, 2- вывести весь список.
* Усложнение проекта на свой вкус) например можно сохранять в формате JSON
* реализовать возможность удаления или изменения записей.
* */


import notebook.Notebook;
import notebook.ShoppingList;
import presenter.Presenter;
import ui.Console;
import ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Notebook shoppingList = new ShoppingList();
        new Presenter(view, shoppingList);

        view.start();

    }
}
