package arrays;

public class SortedArray {
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        boolean sorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }else{
                sorted=true;
            }
        }
        if(sorted==true){
            System.out.println("The Array is sorted");
        }else{
            System.out.println("The Array is not sorted");
        }
    }
}
