import java.util.Scanner;
class max{
    public static void main(String args[]){
        int v;
        float k;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        k=(float)(v*(v-1))/2;
        System.out.println((int)k);
        sc.close();
    }
}