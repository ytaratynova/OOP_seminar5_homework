package notebook;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList extends Notebook{
    private List<String> shoppingList;

    public ShoppingList(){
        shoppingList = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Купить:\n" + super.toString();
    }
}
