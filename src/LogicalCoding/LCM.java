package LogicalCoding;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int gcd=findGcd(a,b);
        int Lcm=(a*b)/gcd;
        System.out.println("LCM of two numbers you entered is: "+Lcm);
        scanner.close();
    }
    private static int  findGcd(int num1,int num2){
        while(num1>0&&num2>0){
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            }
        }
        if(num1==0){
            return num2;
        }else{
            return num1;
        }
    }
}
