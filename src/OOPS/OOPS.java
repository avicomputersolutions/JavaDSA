package OOPS;

public class OOPS {
    int a;
   int b;
   float c;
   float d;

   // Default Constructor
   OOPS(){

   }
    // Parameterized constructor
    OOPS(int c,int d){
        a=c;
        b=d;
    }
    //Constructor Overloading
    OOPS(float c,float d){
        this.c=c;
        this.d=d;
    }
    OOPS(int c,float d){
       this.a=c;
       this.c=d;
    }
    // return type Methodname(){  Code }
    //    // Parameterized Method
   int add(int a,int b){
        int c=a+b;
        return c;
    }
    //Method Overloading for float
    float add(float c, float d){
        float c1=c+d;
        return c1;
    }
    float add(int c, float d){
        float c1=c+d;
        return c1;
    }

    int sub(){
        int c=a-b;
        return c;
    }
    int multiply(){
        int c=a*b;
        return c;
    }
    int divide(){
        int c=a/b;
        return c;
    }
     boolean techNumber(int n){
       int c=0;
       int temp=n;
       int org=n;
         int sum=0;
       while(n!=0){
           c++;
           n/=10;
       }
       if(c%2==0){

           while(temp!=0){
               int no=temp % (int)Math.pow(10,c/2);
               System.out.println("digit"+no);
               sum+=no;
               temp/= (int)Math.pow(10,c/2);

           }
       }else{
           return false;
       }
         System.out.println("sum="+sum);
       if(org==Math.pow(sum,2)){

           return true;
       }else {
           return  false;
       }
     }
}
