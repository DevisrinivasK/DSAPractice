package arrays;

public class GenerateAllSubArrays {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        /*The outer loop helps to loop from start=0 to start=4
            start=0
            start=1
            start=2
            start=3
            start=4
         */
        for(int start=0;start<n;start++){
            /* The inner loop here helps to navigate as follows
            start=0    end=0     1
            start=0    end=1     1 2
            start=0    end=2     1 2 3
            start=0    end=3     1 2 3 4
            start=0    end=4     1 2 3 4 5
             */
            for(int end=start;end<n;end++){
                /*The innermost loop is used to print
                we got start and end values and print the elements
                from start to end
                 */
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println(); // Move to next subarray after printing one array
            }
        }
    }
}
/*Maximum number of valid subarrays that can be generated for an array can be calculated using formula
n*(n+1)/2
 */