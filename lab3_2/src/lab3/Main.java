package lab3;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Doberman dog1 = new Doberman("Billy");
        dog1.bork();
        out.println(dog1.getName());
        Boxer dog2 = new Boxer("Michael");
        dog2.bork();
        dog2.snap();

    }
}
