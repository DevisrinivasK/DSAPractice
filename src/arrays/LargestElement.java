package arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] arr={1,2,3,4,7,9,12,3,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println("Largest element in the give array is: "+max);
    }
}
