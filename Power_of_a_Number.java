import java.util.*;
class pon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=sc.nextInt();
        int r=sc.nextInt();
        System.out.println((int)(Math.pow(v,k))%r);
    }
}