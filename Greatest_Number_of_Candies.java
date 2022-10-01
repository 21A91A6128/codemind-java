import java.util.*;
class gnc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vk[]=new int[n];
        for(int i=0;i<n;i++){
            vk[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int v=vk[0];
        for(int k:vk){
            if(v<k){
                v=k;
            }
        }
        for(int k:vk){
            if((r+k)>=v){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}