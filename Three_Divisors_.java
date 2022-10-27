import java.util.*;
class td{
    public static int fac(int n){
        int c=0;
        for (int i=2;i*i<=n;i++) {
            if (nonpri(i)) 
            {
                if (i*i<=n) 
                    c+=1;
            }
        }
        return c;
    }
    public static boolean nonpri(int n){
        for (int i=2;i*i<=n;i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fac(n));
    }
}