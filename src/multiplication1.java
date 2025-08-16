import java.util.Scanner;

class multiplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World\n");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();
        multipication(num);

    }

    public static void multipication(int num) {
        int i = 0;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + num * i);
            i++;
        }

    }
}
