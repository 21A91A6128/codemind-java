import java.util.*;
class esc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int v[]=new int[n];
        while(n>0){
            v[k++]=(char)(65+((n-1)%26));
            n=(n-1)/26;
        }
        for(k=k-1;k>=0;k--){
            System.out.print((char)v[k]);
        }
    }
}