package arrays;

public class MinimumCostToMakeArraySizeOne {
    public static void main(String[] args){
        int[] arr={4,3,2};
        int n= arr.length;
        int minCost=(n-1)*minElement(arr);
        System.out.println("Minimum cost to make array size 1 by removing larger of pairs: "+minCost);
    }
    static int minElement(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}
/*
The goal is to reduce the array to size 1 by repeatedly removing the larger element from any pair.

Each removal costs the smaller element in the pair.

To minimize total cost, always pair removals with the smallest element in the array.

The minimum cost formula = (n - 1) * smallest element, where n = array size.

Find the minimum element using a simple loop and multiply by (n - 1) to get the answer.
 */