package OOPS.InnerClass;

public class OuterClass {
    // 1st
    // private class InnerClass {
    // public void display() {
    // System.out.println("This is inner class!");
    // }
    // }
    // public void inner(){
    // InnerClass in=new InnerClass();
    // in.display();
    // }

    // 2nd

    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("Inner class!");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
    }

}
