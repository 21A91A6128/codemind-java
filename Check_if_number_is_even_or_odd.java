import java.util.Scanner;
class eoo{
    public static void main(String args[]){
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        if(v%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}