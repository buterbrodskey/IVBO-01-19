package lab3;

public abstract class Dog {
    private String name = "HotDog";

    Dog() {
    }

    Dog(String name) {
        this.name = name;
    }

    public void bork() {
        System.out.println("woof...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
