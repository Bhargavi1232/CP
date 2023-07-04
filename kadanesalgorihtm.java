import java.util.*;

class kadanesalgorithm{
    public static void main(String[] args){
        //int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int[] arr={1,2,3,-2,5};
        solution(arr);
    }
    public static void solution(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}