package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args){
        int[] arr={1,2,3,3,4};
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
