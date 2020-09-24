package lab3;

import lab3.Dog;

public class Boxer extends Dog {
    Boxer(String name) {
        super(name);
    }

    public void snap() {
        System.out.println("Nipped..");
    }

    @Override
    public void bork() {
        super.bork();
        System.out.println("    grrrr....");
    }
}