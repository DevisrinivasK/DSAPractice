package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateUsingReversal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=scanner.nextInt();
        k=k%n;
        arr=reverse(arr,0,k-1);
        arr=reverse(arr,k,n-1);
        arr=reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
    public static int[] reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
/*Algorithm (using reversal):

Reverse the first k elements → arr[0 … k-1]

Reverse the remaining n−k elements → arr[k … n-1]

Reverse the whole array → arr[0 … n-1]

Example (Left Rotate)

Input:
arr = [1, 2, 3, 4, 5, 6, 7], k = 2

Steps:

Reverse first k=2 → [2, 1, 3, 4, 5, 6, 7]

Reverse rest → [2, 1, 7, 6, 5, 4, 3]

Reverse whole → [3, 4, 5, 6, 7, 1, 2]

Output: [3, 4, 5, 6, 7, 1, 2]

 */
