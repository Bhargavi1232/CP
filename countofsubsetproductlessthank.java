import java.util.*;

class countofsubsetproductlessthank {
    public static void main(String [] args){
        int[] arr={1,2,3,4};
        int k=10;
        System.out.println(solution(arr,k));
    }

    private static int solution(int[] arr,int k) {
        int count=0;
        long pro=1;
        int l=0,r=0;
        while(r<arr.length){
            pro*=arr[r];
            while(l<arr.length && pro>=k){
                pro=pro/arr[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }

}
