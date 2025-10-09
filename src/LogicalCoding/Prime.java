package LogicalCoding;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        checkPrime(num);
        scanner.close();
    }
    private static void checkPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        if(count==2)    System.out.println("Prime number");
        else    System.out.println("Not a prime number");
    }


}
