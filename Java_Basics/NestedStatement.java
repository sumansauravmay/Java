import java.util.Scanner;

public class NestedStatement {
    public static void main(String[] args) {
        System.out.println("Put your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);
        if (age > 18) {
            System.out.println("Put your food: ");
               String food=sc.nextLine();
               if(food.equals("pizza")){
                System.out.println("Mine too!");
               }else{
                System.out.println("Not mine!");
               }


        } else {
            System.out.println("Teenager!");
        }
    }
}
