import java.util.*;
class spyn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=0;
        int k=1;
        while(vk>0){
            v+=(vk%10);
            k*=(vk%10);
            vk/=10;
        }
        if(v==k){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}