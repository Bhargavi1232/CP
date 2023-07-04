import java.util.*;

class leftrotatearray{
    public static void main(String args[]){
        int[] arr={2,5,3,7,8,9};
        int d=4;
        solution(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    public static void solution(int[] arr,int d){
        int[] temp=new int[d];
        int n=arr.length;
        for(int i=0;i<d;i++)
            temp[i]=arr[i];
        for(int i=d;i<n;i++)
            arr[i-d]=arr[i];
        for(int i=0;i<d;i++)
            arr[i+n-d]=temp[i];
    }
}