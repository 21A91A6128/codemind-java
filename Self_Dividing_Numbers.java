import java.util.*;
class sdn{
    public static boolean sdn(int vk){
        int v=0;
        int k=0;
        int r=vk;
        while(vk>0){
            int t=vk%10;
            if(t!=0 && r%t==0){
                v++;
            }
            k++;
            vk/=10;
        }
        if(v==k){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=0;
        for(int i=a;i<=b;i++){
            if(sdn(i)){
                System.out.print(i+" ");
            }
        }
    }
}