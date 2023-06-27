import java.util.*;


/*sort an array hich contains 0,1,2's only  eq:{0,1,2,1,2,2,0}*/

class countingsort{
    public static void main(String[] arg){
        int[] arr={0,1,2,0,0,1,2,0,1,1};
        counting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void counting(int[] arr) {
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zeros++;
            else if(arr[i]==1)
                ones++;
            else 
                twos++;
        }
        //System.out.println(zeros+" "+ones+" "+twos);
        int i,j,k;
        for(i=0;i<zeros;i++){
            arr[i]=0;
        }
        for(j=i;j<ones+zeros;j++){
            arr[j]=1;
        }
        for(k=j;k<arr.length;k++){
            arr[k]=2;
        }
    }
}