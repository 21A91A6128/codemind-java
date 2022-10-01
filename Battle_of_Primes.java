import java.util.*;
class bop{
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=a+b+1;
        for(int i=a+b+1;;i++){
            if(prm(i)){
                r=i;
                break;
            }
        }
        System.out.println(r-a-b);
    }
}