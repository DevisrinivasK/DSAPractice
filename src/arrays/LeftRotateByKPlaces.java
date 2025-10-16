package arrays;
import java.util.Scanner;
import java.util.*;
public class LeftRotateByKPlaces {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int k=scanner.nextInt();
        k=k%n;
        for(int i=0;i<k;i++){
            int firstElement=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=firstElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
