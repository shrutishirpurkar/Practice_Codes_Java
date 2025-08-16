import java.util.Scanner;

public class ifelseeee {
    public static void main(String[] args) {
        System.out.println("Beep Beep be ready to shoot the code \uD83D\uDC4D");
        System.out.println("Increment and Decrement ");
        int a;
        a = 5;

        int b=a++;
        System.out.println(b);
        System.out.println(a);
        int c=++a;
        System.out.println(a);
        System.out.println(c);
        int d=a--;
        System.out.println(b);
        System.out.println(a);
        int e=--a;
        System.out.println(b);
        System.out.println(a);

        System.out.println("Conditional statements:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your AGE :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are Eligible for VOTING");
        }
        else {
            System.out.println("You are MINOR");
        }
        System.out.println("Nested if else");
        Scanner pt = new Scanner(System.in);
        System.out.println("Give me number  :");
        int number = pt.nextInt();
        if (number/2==0 ){
            System.out.println("its even number");
            if(number/9==0){
                System.out.println("its even also its divisible by 9");
            }
            if(number==0){
                System.out.println("please give another number");
            }
            else {
                System.out.println("its not even and not divisible by 9");
            }
        }
        System.out.println("Assignment  operator");
        int m=10;
        m=m+5;
        System.out.println(m);
        System.out.println("SWITCH");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number mapping\n");
        System.out.print("Please enter your number: ");
        int numb = input.nextInt();
        switch (numb) {
            case 1 :
                System.out.println("ONE");
            break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            case 4 :
                System.out.println("FOUR");
                break;
            case 5 :
                System.out.println("Five");
            default:
                System.out.println("try again later");

        }
        System.out.println("for loop");
        for(int i=0; i<=50;i++){
            System.out.println("50"+"X"+i+"="+50*i);
        }
        System.out.println("do-while");

    }

}
