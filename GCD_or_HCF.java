import java.util.*;
class gcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=sc.nextInt();
        int l=1;
        for(int i=1;i<=v && i<=k;i++){
            if(v%i==0 && k%i==0){
                l=i;
            }
        }
        System.out.println(l);
    }
}