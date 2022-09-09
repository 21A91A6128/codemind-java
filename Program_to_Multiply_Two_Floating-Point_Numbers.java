import java.util.Scanner;
class mpn{
    public static void main(String args[]){
        float v,k;
        Scanner sc=new Scanner(System.in);
        v=sc.nextFloat();
        k=sc.nextFloat();
        System.out.format("%.2f",v*k);
        sc.close();
    }
}