package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class RightRotateByKPlaces {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        int k=s.nextInt();
        int n= arr.length;
        /* Repeat right rotate by one place for k times
        we use k=k%n because to skip unnecessary multiple of k
        iterations for multiples of k when k value is above n
         */
        k=k%n;
        for(int i=0;i<k;i++){
            int lastElement=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=lastElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
