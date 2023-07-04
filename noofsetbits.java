import java.util.*;

class noofsetbits{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();
        solution(n);
    }
    public static void solution(int num){
        List<Integer> binary=new ArrayList<>();
        while(num>0){
            binary.add(num%2);
            num=num/2;
        }
        for(int i=binary.size()-1;i>=0;i--){
            System.out.print(binary.get(i)+" ");
        }
        int c=0;
        System.out.println();
        for(int a:binary){
            if(a==1){
                c++;
            }
        }
        System.out.println(c);
    }
}