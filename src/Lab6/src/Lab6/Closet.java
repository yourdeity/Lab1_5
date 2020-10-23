package Lab6;

public class Closet extends Furniture {

    int doors;
    int shelves;

    @Override
    void GetInfo() {
        System.out.println("Number of doors: " + doors);
        System.out.println("Number of shelves: " + shelves);
    }
}
