import java.util.*;
class sn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int kv=vk;
        int r=0;
        while(vk>0){
            int n=vk%10;
            int s=1;
            while(n>0){
                s*=n;
                n--;
            }
            r+=s;
            vk/=10;
        }
        if(r==kv){
            System.out.println("The number "+r+" is a strong number");
        }
        else{
            System.out.println("The number "+kv+" is not a strong number");
        }
    }
}