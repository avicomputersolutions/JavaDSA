package OOPS.DataAbstraction;

public class UsingAccessModifier {
    private String name;
    protected int id;
    public int salary;

    public  UsingAccessModifier(String n, int i, int s){
        name=n;
        id=i;
        salary=s;
    }

    private void printPrivate(){
        System.out.println(name);
    }
    protected void printProtected(){
        System.out.println(id);
    }
}
