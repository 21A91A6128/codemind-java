import java.util.*;
class dbk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int j=0,k;
		int v[]=new int[n];
		for(k=0;k<n;k++)
		{
			v[k]=sc.nextInt();
			if (v[k]%d!=0){
			    j++;
			}
			
		}
		System.out.print(j);
    }
}