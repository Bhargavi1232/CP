import java.util.*;

class reversegroupedarray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int k=4;
        solution(arr,k);
    }
    public static void solution(int[] arr,int k){
        if(k>arr.length){
            reverse(arr,0,arr.length-1);
        }
        else{
            for(int i=0;i<arr.length;i+=k){
                int s=i;
                int e=Math.min(i+k-1,arr.length-1);
                reverse(arr,s,e);
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void reverse(int[] arr,int s,int e){
        if(s>e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}