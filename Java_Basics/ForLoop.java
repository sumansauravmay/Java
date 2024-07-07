import java.util.Scanner;;

public class ForLoop {
    public static void main(String[] args) {
        // String bag = "";
        // for (int i = 0; i < 10; i++) {
        // bag += i + " ";
        // System.out.println(i);
        // }
        // System.out.println(bag);

        // int[] arr = { 1, 4, 6, 3, 5, 3, 5 };
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 5) {
        // System.out.println("found!");
        // } else {
        // System.out.println("not found!");
        // }
        // }

        // int[] arr = { 1, 4, 6, 3, 5, 3, 5 };
        // int count = 0;
        // for (int element : arr) {
        // System.out.println(element + " " + count);
        // count++;
        // }

        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
            // break;
        }
        for (String n : names) {
            System.out.println(n);
        }
    }
}
