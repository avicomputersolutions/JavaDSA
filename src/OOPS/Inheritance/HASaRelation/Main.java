package OOPS.Inheritance.HASaRelation;



public class Main {
    public static void main(String[] args) {
        int id=124;
        String name="Nikhil";
        String city="BHopal";
        String C="India";
        Add a=new Add(city,C);
        Emp e1=new Emp(name,id,a);
        e1.display();
        System.out.println(e1.address.City+" "+e1.address.Country);
    }
}
