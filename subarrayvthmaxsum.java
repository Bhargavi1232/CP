import java.util.*;

class subarrayvthmaxsum{
    public static void main(String[] args){
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        //int[] arr={1,2,3,-2,5};
        solution(arr);
    }
    public static void solution(int arr[]){
        int sum=0,max=Integer.MIN_VALUE;
        int start=-1,end=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
                end=i;
            }
        }
        int[] ans={start,end};
        System.out.println(Arrays.toString(ans));
    }
}