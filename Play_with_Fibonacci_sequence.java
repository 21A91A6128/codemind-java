import java.util.*;
class Fib{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0,k=1,r=0;
        System.out.print(v+" "+k+" ");
        for(int i=n;i>2;i--){
            r=v+k;
            v=k;
            k=r;
            System.out.print(r+" ");
        }
    }
}