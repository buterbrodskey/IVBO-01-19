package pract4;

public class Dollar implements Priceable {

    private final int price = 75;

    Dollar() {
    }
    @Override
    public int getPrice() {
        return price;
    }
}