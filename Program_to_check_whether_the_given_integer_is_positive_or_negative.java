import java.util.Scanner;
class eoo{
    public static void main(String args[]){
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        if(v>=0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
        sc.close();
    }
}