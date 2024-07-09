package OOPS.StaticClass;

public class Dog {

    protected static int count = 0;

    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
        Dog.display2();
    }

    public static void display2() {
        System.out.println("I am display2!");
    }

    public static void display() {
        System.out.println("I am display!");
    }
}
