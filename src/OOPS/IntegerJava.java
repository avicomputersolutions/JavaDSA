package OOPS;

public class IntegerJava implements Operation {
    int a,b;
    public void add(){
        int c= a+b;
        System.out.println(c);
    }
    public void minus(){
        int c= a-b;
        System.out.println(c);
    }
    public void multipy(){
        int c= a*b;
        System.out.println(c);
    }
}
