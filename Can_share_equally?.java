import java.util.Scanner;
class cse{
    public static void main(String args[]){
        int v,k,l;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        k=sc.nextInt();
        l=v+(2*k);
        if(v==0 && k%2==0)
        {
            System.out.println("YES");
        }
        else if(v==0 && k%2!=0)
        {
            System.out.println("NO");
        }
        else if(l%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}