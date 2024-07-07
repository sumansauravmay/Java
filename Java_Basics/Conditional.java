import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x=5;
        int y=6;
        if (s.equals("suman")) {
            System.out.println("True");
        }
        else if(x>y){
            System.out.println("True2");
        }else{
            System.out.println("False");
        }
    }
}
