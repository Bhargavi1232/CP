import java.util.*;

class twosum{
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(solution(arr,target)));
    }
    static int[] solution(int[] arr,int target){
       HashMap<Integer,Integer> h=new HashMap<>();
       //int ans[]={0,0};
       for(int i=0;i<arr.length;i++){
            int com=target-arr[i];
            if(h.containsKey(com)){
                return new int[]{h.get(com),i};
            }
            else{
                h.put(arr[i],i);
            }
       }
       return new int[]{};
    }
}