package arrays;

public class SecondSmallestElement {
    public static void main(String[] args){
        int[] arr={1,2,3,7,8,9,10};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secondSmallest&&arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println("Second smallest element in the given array is: "+secondSmallest);
    }
}
