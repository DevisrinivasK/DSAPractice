package LogicalCoding;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        if (rev == original) System.out.println("Palindrome number");
        else System.out.println("Not a palindrome number");
        scanner.close();
    }
}
