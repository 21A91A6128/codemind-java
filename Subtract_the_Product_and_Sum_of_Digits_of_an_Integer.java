import java.util.*;
class sps{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int v=0;
        int k=1;
        while(r>0){
            v+=(r%10);
            k*=(r%10);
            r/=10;
        }
        System.out.println(k-v);
    }
}