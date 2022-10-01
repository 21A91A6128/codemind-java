import java.util.*;
class rop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            int k=sc.nextInt();
            if(v<r || k<r){
                System.out.println("UPLOAD ANOTHER");
            }
            else{
                if(v==k){
                    System.out.println("ACCEPTED");
                }
                else{
                    System.out.println("CROP IT");
                }
            }
        }
    }
}