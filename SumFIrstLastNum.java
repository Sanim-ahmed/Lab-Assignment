import java.util.Scanner;

public class SumFirstLastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println("Sum of first and last digit = " + (first + last));
    }
}
