import java.util.*;
class sops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vk=0,i,j;
        int a[]=new int[n];
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        for (i=0;i<n;i++)
            for (j=0;j<=a[i];j++)
                if (j*j==a[i])
                    vk+=a[i];
        System.out.println(vk);
    }
}