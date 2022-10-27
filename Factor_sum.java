import java.util.*;
class fs
{
    public static int fac(int n)
    {
        int r=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                r+=i;
        }
        return r;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(",",30);
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<arr.length;i++)
            ar.add(Integer.parseInt(arr[i]));
        boolean f=false;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i=0;i<ar.size();i++)
        {
            if (ar.contains(fac(ar.get(i))))
            {
                f=true;
                a.add(ar.get(i));
            }
        }
        if (f==false)
            System.out.print(-1);
        else
        {
            Collections.sort(a);
            for (int ele:a)
                System.out.print(ele+" ");
        }
    }
}