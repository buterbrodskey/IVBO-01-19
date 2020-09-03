public class Dog {

    private String name;

    private int age;

    public Dog(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Dog() {}




    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int getHumanAge() {
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
