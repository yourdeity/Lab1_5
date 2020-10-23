package Lab6;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> items = new ArrayList<>();

    FurnitureShop() {
        items.add(new Table());
        items.add(new Closet());

    }

    Furniture GetItem(int index){
        return items.get(index);
    }

}
