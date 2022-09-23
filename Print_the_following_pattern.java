import java.util.*;
class pat{
	public static void main(String[] args){
	    int r;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=i;j<=r;j++){
		           System.out.print(j+" ");
		        }
		    System.out.println();
		}
	}
}