package Lab6;

public class ShopTester {
    public static void main(String[] args) {
        FurnitureShop ikea = new FurnitureShop();
        Person Vasya = new Person();
        System.out.println(Vasya.basket);

        Vasya.basket.add(ikea.GetItem(0));
        Vasya.AddItem(ikea.GetItem(0));

        System.out.println(Vasya.basket);
    }
}
