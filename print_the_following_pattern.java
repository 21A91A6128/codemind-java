import java.util.*;
class pat{
	public static void main(String[] args){
	    int r;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
		for(int i=0;i<r;i++){
		    for(int j=0;j<r;j++){
		        if(i+j==r-1 || i==j){
		            System.out.print("x");
		        }
		        else{
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		}
	}
}