package arrays;

public class SmallestElement {
    public static void main(String[] args){
        int[] arr={1,3,2,45,3,0,9,7,8};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println("Smallest element in the given array is: "+min);
    }
}
