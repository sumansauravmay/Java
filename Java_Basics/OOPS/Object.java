package OOPS;

public class Object {
    public static void main(String[] args) {

        func("Suman Saurav", 3);
        int y = add(5);
        System.out.println(y);
        System.out.println(str("hi"));
    }

    public static void func(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x += "!";
    }
}
