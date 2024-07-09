package OOPS.Class;

// Inheritance

public class Cat extends Dog {
    private String food;

    public Cat(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food="Pizza";
    }

    public Cat(String name) {
        super(name, 0);
        this.food="Burger";
    }

    public void speak() {
        System.out.println("My name is " + this.name + " , I am " + this.age + " and I like " + this.food);
    }

    public void eat(int age) {
        this.age = age;
    }
}
