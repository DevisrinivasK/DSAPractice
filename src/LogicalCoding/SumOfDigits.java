package LogicalCoding;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum+=ld;
            num/=10;
        }
        System.out.println("Sum of digits og the entered number is: "+sum);
        scanner.close();
    }
}
