import java.util.*;
class ld{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=v%10;
        while(v>0){
            int r=v%10;
            if(k<r){
                k=r;
            }
            v/=10;
        }
        System.out.println(k);
    }
}