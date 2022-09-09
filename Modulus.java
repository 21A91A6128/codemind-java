import java.util.Scanner;
class avg{
    public static void main(String args[]){
        int v,k;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        k=sc.nextInt();
        System.out.println(v%k);
        sc.close();
    }
}