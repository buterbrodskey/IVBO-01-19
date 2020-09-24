package pract4;

public class Cap implements Priceable {

    private int price = 500;

    Cap() {

    }
    Cap(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
