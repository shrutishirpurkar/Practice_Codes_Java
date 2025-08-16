import java.util.Scanner;
public class hiiii {
    public static void main(String[] args) {
        //System.out.println("first program ");
        //System.out.println("HELLO WORLD");
        //System.out.println("second program");
        //int a=8;
        //int b=9;
       // int c;
       // c=a+b;
       // System.out.println("sum of two number is :"+c);
        //System.out.println("Third program");
        //System.out.println("Size of int:"+Integer.SIZE);
        //System.out.println("Size of float:"+Float.SIZE);
       // System.out.println("fourth program");
       // int first=5;
        //int second=8;
        //if((first^second)==0){
          //  System.out.println("numbers are same" );
        //}
        //else {
          //  System.out.println("numbers are not same");
       // }
        //int myInt=(int)4.56;
        //System.out.println(myInt);
       // float myFloat=(float)7;
        //System.out.println(myFloat);
        Scanner sc=new Scanner(System.in);
        System.out.println("Give first number :");
        int a=sc.nextInt();
        System.out.println("Give second number :");
        int b=sc.nextInt();
        int c,d,e,f,g;
        c=a+b;
        d=a-b;
        f=a*b;
        g=a/b;
        e=a%b;
        System.out.println("****************************ARITHMETIC OPERATIONS******************************");
        System.out.println("Sum of two number is : "+c);
        System.out.println("Subtraction of two number is : "+d);
        System.out.println("Multiplication of two number is : "+f);
        System.out.println("Division of two number is : "+g);
        System.out.println("Modulus of two number is : "+e);
        System.out.println("****************************RELATIONAL OPERATIONS******************************");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("****************************LOGICAL OPERATIONS******************************");
        System.out.println((10>2) && (9<6));
        System.out.println((10>2)||(9<6));
        System.out.println((10>2)^(9<6));



    }
}