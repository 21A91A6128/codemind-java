import java.util.*;
class sor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int j=0;j<a;j++)
		{
		    long n=sc.nextLong();
		    long x=sc.nextLong();
			if (n==1)
                if(x%2==0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            else if(x%2==1)
                if(n%2==0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            else 
                System.out.println("Impossible");
		}
    }
}