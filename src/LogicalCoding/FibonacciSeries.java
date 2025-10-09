package LogicalCoding;
import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(fibonacci(i)+" ");
        }
        scanner.close();
    }
    private static int fibonacci(int n){
        int curr=0;
        int last=1;
        int secondLast=0;
        if(n==0||n==1)  return n;
        for(int i=2;i<=n;i++){
            curr=last+secondLast;
            secondLast=last;
            last=curr;
        }
        return curr;
    }


}
