package pract4;

public class Main {
    public static void main(String[] args) {
        Horses horses = new Horses(1200);
        System.out.println("Price for one Horse: " + horses.getPrice());

        Dollar one = new Dollar();
        System.out.println("Price for one Dollar: "+ one.getPrice());

        Cap cap = new Cap(760);
        System.out.print("Price for one cap: " + cap.getPrice());
    }
}