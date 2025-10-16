package arrays;
import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] arr={1,0,0,1,1,0};
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n){
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
Here we first copy the non-zero elements to front of array
and then paste zeroes at the end
We  take a count variable initialized with zero  and
If element traversed is not zero we paste it at count index and increment count value
After these traversal we traverse from count to last index and add zeroes there
 */
