package OOPS.Inheritance.HASaRelation;

public class Emp {
    String name;
    int Id;
    Add  address;

    Emp(String n,int i, Add a){
       name=n;
       Id=i;
       address=a;

    }
    public void display(){
        System.out.println(name+" : "+Id+" : "+address);
    }
}
