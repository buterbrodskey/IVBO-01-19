public class MyClass {
    public static void main(String[] args) {

        Dog firstdog = new Dog(7,"Chappi");

        System.out.println(firstdog.getName()+ " " + firstdog.getAge() + " " + firstdog.getHumanAge() );

        AnimalHouse.act(firstdog, 3, "Bob");

        System.out.println(firstdog.getName()+ " " + firstdog.getAge() + " " + firstdog.getHumanAge() );

    }
}
