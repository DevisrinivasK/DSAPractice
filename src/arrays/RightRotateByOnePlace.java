package arrays;
import java.util.Arrays;
public class RightRotateByOnePlace {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int lastElement=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastElement;
        System.out.println(Arrays.toString(arr));
    }
}
/* Since right rotation by one place the first element of array will be
last element of array so we need to store last element of array before
performing operations
We traverse through the array from last element to second index
and set as arr[i]=arr[i-1]
*/
/*We need to traverse till second index only
because if we traverse till first index the logic will try to
allot -1 index value to last element which will throw arrayindex out of bound error
*/