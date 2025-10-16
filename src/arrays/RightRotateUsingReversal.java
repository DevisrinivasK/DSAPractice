package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class RightRotateUsingReversal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=scanner.nextInt();
        k=k%n;
        arr=reverse(arr,n-k,n-1);
        arr=reverse(arr,0,n-k-1);
        arr=reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
    public static int[] reverse(int[] arr, int start, int end){
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

/*
Algorithm (using reversal):

Reverse the last k elements → arr[n−k … n−1]

Reverse the first n−k elements → arr[0 … n−k−1]

Reverse the whole array → arr[0 … n−1]

Example (Right Rotate)

Input:
arr = [1, 2, 3, 4, 5, 6, 7], k = 2

Steps:

Reverse last k=2 → [1, 2, 3, 4, 5, 7, 6]

Reverse first n−k=5 → [5, 4, 3, 2, 1, 7, 6]

Reverse whole → [6, 7, 1, 2, 3, 4, 5]

Output: [6, 7, 1, 2, 3, 4, 5]

 */
