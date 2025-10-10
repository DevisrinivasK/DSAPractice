package LogicalCoding;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int gcd=1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        System.out.println("Greatest common Divisor of two numbers you entered is: "+gcd);
        scanner.close();
    }
}
