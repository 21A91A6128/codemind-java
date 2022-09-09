import java.util.Scanner;
class temp{
    public static void main(String args[]){
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        float k=32+(float)(v*9)/5;
        System.out.format("%.2f",k);
        sc.close();
    }
}