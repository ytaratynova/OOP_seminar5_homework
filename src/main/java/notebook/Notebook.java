package notebook;

import java.util.ArrayList;
import java.util.List;

// абстрактный класс, у которого могут быть наследники - типа списка покупок, ежедневный список дел,
// планировщик задач
public abstract class Notebook implements Service{
    private List<String> notebook;

    public Notebook(){
        notebook = new ArrayList<String>();
    }

    public void addNote(String note){
        this.notebook.add(note);
    }

    public String toString(){
        String string = "";
        for (int i = 0; i < this.notebook.size(); i++){
            string += i+1 + ". " + this.notebook.get(i) + "\n";
        }
        return string;
    }
}
