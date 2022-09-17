import java.util.Scanner;
class gor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v,k,l;
        v=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        if(v>50 && k>60 && l>100)
        {
            System.out.println(10);
        }
        else if(v>50 && k>60 && l<100)
        {
            System.out.println(9);
        }
        else if(v<50 && k>60 && l>100)
        {
            System.out.println(8);
        }
        else if(v>50 && k<60 && l>100)
        {
            System.out.println(7);
        }
        else if(v>50 || k>60 || l>100)
        {
            System.out.println(6);
        }
        else
        {
           System.out.println(5);
        }
        sc.close();
    }
}