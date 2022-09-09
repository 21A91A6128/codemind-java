import java.util.Scanner;
class avg{
    public static void main(String args[]){
        int v,k,r;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        k=sc.nextInt();
        r=sc.nextInt();
        System.out.println(v*k*r*512*2);
        sc.close();
    }
}