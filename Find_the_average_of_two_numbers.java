import java.util.Scanner;
class avg{
    public static void main(String args[]){
        int v,k;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        k=sc.nextInt();
        float avg=(float)(v+k)/2;
        System.out.format("%.4f",avg);
        sc.close();
    }
}