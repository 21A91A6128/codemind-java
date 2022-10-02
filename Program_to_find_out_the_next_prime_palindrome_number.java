import java.util.*;
class pnpp{
    public static boolean pal(int vk){
        int v=vk,k=0;
        while(vk>0){
            k=k*10+(vk%10);
            vk=vk/10;
        }
        if(k==v){
            return true;
        }
        return false;
    }
    public static boolean prm(int vk){
        int r=0;
        for(int i=1;i<=vk;i++){
            if(vk%i==0){
                r++;
            }
        }
        if(r==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;;i++){
            if(pal(i) && prm(i)){
                System.out.println(i);
                break;
            }
        }
    }
}