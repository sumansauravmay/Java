package OOPS.ObjectComp;

public class Main {
    public static void main(String[] args){
        Student s=new Student("suman");
        Student s2=new Student("saurav");

        System.out.println(s==s2);//false
        System.out.println(s.equals(s2));//false
        System.out.println(s.compareTo(s2));//compare by words(20)
        System.out.println(s.compareTo(s2)>0);//true
        System.out.println(s.compareTo(s2)<0);//false
        System.out.println(s);//memory location
        System.out.println(s2.toString2());
    }
}
