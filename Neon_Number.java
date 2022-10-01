import java.util.*;
class nn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=vk*vk;
        int k=0;
        while(v>0){
            k+=(v%10);
            v/=10;
        }
        if(k==vk){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}