import java.util.Scanner;

public class OddSum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sum of odd number\n");
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        int sum = OddSum(num);
        System.out.println("OddSum till " + num + " is " + sum);
    }

    public static int OddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i += 5
            ;
        }
        return sum;
    }
}
