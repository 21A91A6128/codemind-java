import java.util.*;
class paln{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=vk;
        int k=0;
        while(vk>0){
            k=k*10+(vk%10);
            vk/=10;
        }
        if(k==v){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}