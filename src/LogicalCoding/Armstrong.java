package LogicalCoding;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int temp=num;
        int k=Integer.toString(num).length();
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum+=Math.pow(ld,k);
            num/=10;
        }
        if(sum==temp)   System.out.println("Armstrong Number");
        else    System.out.println("Not a Armstrong Number");
        scanner.close();
    }

}
