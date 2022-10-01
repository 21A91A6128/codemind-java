import java.util.*;
class fib{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0,k=1,r=0;
        while(n>0){
            System.out.print(r+" ");
            r=v+k;
            k=v;
            v=r;
            n--;
        }
    }
}