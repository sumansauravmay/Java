import java.util.Scanner;;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a number: ");
        int x = sc.nextInt();
        while (x != 10) {
            System.out.println("type 10...");
            System.out.print("type a number: ");
            x = sc.nextInt();
        }
    }
}
