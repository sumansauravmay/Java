package OOPS.StaticClass;

public class CreateClass {
    public static void main(String[] args) {
        Dog tim = new Dog("Suman", 51);
        Dog.count = 7;

        System.out.println(Dog.count);
    }
}
