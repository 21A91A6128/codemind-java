import java.util.*;
class Fibn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0,k=1,r=0,a=0;
        for(int i=1;i<n*2;i++){
            r=v+k;
            v=k;
            k=r;
            if(r>=n){
                if(r==n){
                    a=1;
                    System.out.println("True");
                }
                break;
            }
        }
        if(a==0){
            System.out.println("False");
        }
    }
}