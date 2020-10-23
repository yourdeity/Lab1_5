package Lab6;

public class Table extends Furniture  {
    int legs;
    int height;


    @Override
    void GetInfo() {
        System.out.println("Number of legs: " + legs);
        System.out.println("Height: " + height);
    }
}
