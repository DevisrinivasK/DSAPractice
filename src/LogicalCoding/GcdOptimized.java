package LogicalCoding;
import java.util.Scanner;
public class GcdOptimized {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int gcd=1;
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            gcd=b;
        }else{
            gcd=a;
        }
        System.out.println("Greatest Common Divisor of two numbers you entered is  "+gcd);
    }
}
