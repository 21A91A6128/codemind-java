import java.util.*;
class eom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=0,k=0;
        int vk=sc.nextInt();
        while(vk>0){
            if((vk%10)%2==0)
                v++;
            else
                k++;
            vk=vk/10;
        }
        if(v!=0 && k==0)
            System.out.println("Even");
        else if(v==0 && k!=0)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}