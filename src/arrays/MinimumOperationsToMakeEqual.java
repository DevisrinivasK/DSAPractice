package arrays;

public class MinimumOperationsToMakeEqual {
    public static void main(String[] args){
        int[] arr={2,5,8};
        int k=3;
        int max=maxElement(arr);
        int res=0;
        boolean possible=true;
        for(int i=0;i<arr.length;i++){
            if((max-arr[i])%k!=0){
                System.out.println("Not possible");
                possible=false;
                break;
            }else{
                res+=(max-arr[i])/k;
            }
        }
        if(possible){
            System.out.println("Minimum operation to make equal is: "+res);
        }

    }
    static int maxElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
