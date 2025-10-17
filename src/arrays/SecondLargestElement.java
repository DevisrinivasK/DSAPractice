package arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr={1,2,3,7,8,9,10};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest&&arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest element in the given array is: "+secondLargest);
    }
}
