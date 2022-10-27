import java.util.*;
class fs{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int z=0;z<n;z++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for (int i=0;i<a+b;i++)
                ar.add(sc.nextInt());
            Collections.sort(ar);
            int c=0;
            for (int i=0;i<ar.size();i++)
            {
                c+=1;
                if (c!=a+b)
                    System.out.print(ar.get(i)+" ");
                else
                    System.out.print(ar.get(i));
            }
            System.out.println();
        }
    }
}