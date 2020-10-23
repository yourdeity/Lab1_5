package Lab6;

import java.util.ArrayList;

public class Person {
    ArrayList<Furniture> basket = new ArrayList<>();
    void AddItem(Furniture item){
        basket.add(item);
    }
}
