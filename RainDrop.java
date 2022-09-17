import java.util.Scanner;
class rd{
    public static void main(String args[]){
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        if(v%3==0 || v%5==0 || v%7==0)
        {
            if(v%3==0)
            {
                System.out.print("Pling");
            }
            if(v%5==0)
            {
                System.out.print("Plang");
            }
            if(v%7==0)
            {
                System.out.print("Plong");
            }
        }
        else
        {
            System.out.print(v);
        }
        sc.close();
    }
}