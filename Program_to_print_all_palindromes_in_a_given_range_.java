import java.util.*;
class paln{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int vk=a;vk<=b;vk++){
            int v=vk,k=0;
            while(v>0){
                k=k*10+(v%10);
                v/=10;
            }
            if(k==vk){
                System.out.print(k+" ");
            }
        }
    }
}