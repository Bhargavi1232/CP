import java.util.Arrays;
/*sort an array hich contains 0,1,2's only  eq:{0,1,2,1,2,2,0}*/

class dutchnationalflag {
    public static void main(String[] arg){
        int[] arr={0,1,2,2,2,0,0,1};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void fun(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
