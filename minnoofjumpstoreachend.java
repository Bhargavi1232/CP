

class minnoofjumpstoreachend {
    public static void main(String args[]){
        //int arr[]={1,4,3,3,6,7};
        int[] arr={1,3,5,8,9,2,6,7,6,8,9};
        System.out.println( solution(arr));
    }

    static int solution(int[] arr) {
        int curr=0,far=0,jumps=0,i;
        for(i=0;i<arr.length-2;i++){
            far=max(far,i+arr[i]);
            if(curr==i){
                jumps++;
                curr=far;
            }
        }
        if(i>curr)
            return -1;
        else 
            return jumps;
    }

     static int max(int far, int i) {
            if(i>far)
                return i;
            else
                return far;
    }
}
