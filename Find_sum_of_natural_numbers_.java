import java.util.Scanner;
class sonn{
    public static void main(String args[]){
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        System.out.println((int)(v*(v+1)/2));
        sc.close();
    }
}