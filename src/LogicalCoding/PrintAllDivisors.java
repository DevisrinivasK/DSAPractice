package LogicalCoding;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PrintAllDivisors {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        ArrayList<Integer> aL=new ArrayList<> ();
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                aL.add(i);
                if(num/i!=i){
                    aL.add(num/i);
                }
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
    }
}
