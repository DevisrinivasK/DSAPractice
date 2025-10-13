package arrays;
import java.util.*;
public class LeadersInArray {
    public static void main(String[] args){
        int[] arr={1,5,3,4,2};
        ArrayList<Integer> aL=new ArrayList<>();
        //BY default last element of an array will be leader
        int n=arr.length;
        int maxFromRight=arr[n-1];
        aL.add(maxFromRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight=arr[i];
                aL.add(maxFromRight);
            }
        }
        //Reverse to print in correct order
        System.out.println(aL);
    }
}
