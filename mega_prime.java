import java.util.*;
class mp{
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
        int r=sc.nextInt();
        if(prm(r)){
            int v=0;
            int k=0;
            while(r>0){
                if(prm(r%10)){
                    v++;
                }
                k++;
                r/=10;
            }
            if(v==k){
                System.out.println("Mega Prime");
            }
            else{
                System.out.println("Not Mega Prime");
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
    }
}