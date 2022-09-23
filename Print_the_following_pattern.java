import java.util.*;
class pat{
	public static void main(String[] args){
	    int r;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
	    int c=r;
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=r;j++){
		           if(i+j==r+1 || i==j){
		               System.out.print(c+" ");
		           }
		           else{
		               System.out.print(" ");
		           }
		    }
		    c--;
		    System.out.println();
		}
	}
}