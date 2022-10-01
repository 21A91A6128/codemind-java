import java.util.*;
class gpn{
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
        int v=sc.nextInt();
        int k=sc.nextInt();
        for(int i=v;i<=k;i++){
            if(prm(i)){
                System.out.println(i);
            }
        }
    }
}