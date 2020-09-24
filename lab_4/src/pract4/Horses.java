package pract4;

public class Horses implements Priceable {

    private int price = 1000;
    Horses() {

    }

    Horses(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
