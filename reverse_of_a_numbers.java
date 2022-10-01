import java.util.*;
class rev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=0;
        while(v>0){
            k=k*10+(v%10);
            v/=10;
        }
        System.out.println(k);
    }
}