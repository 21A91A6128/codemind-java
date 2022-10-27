import java.util.*;
class fs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        for (int i=0;i<3;i++)
            a[i]=sc.nextInt();
        for (int i=0;i<3;i++)
            b[i]=sc.nextInt();
        int v=0,k=0;
        for (int i=0;i<3;i++)
            if (a[i]>b[i])
                v+=1;
            else if(a[i]<b[i])
                k+=1;
        System.out.print(v+" "+k);
    }
}