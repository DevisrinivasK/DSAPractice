package arrays;
import java.util.Arrays;

public class LeftRotateByOnePlace {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int firstElement=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
        System.out.println(Arrays.toString(arr));
    }
}
/* Since left rotation by one place the last element of array will be
        first element of array so we need to store first element of array before
        performing operations
        We traverse through the array and set arr[i]=arr[i+1]
        Left rotate means the element comes to one place before
*/
/*We need to traverse till array length-1 only
because if we traverse till arraylength the logic will try to
allot arraylength+1 value to last element which will throw arrayindex out of bound error
*/
