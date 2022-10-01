import java.util.*;
class paln{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=Math.abs(vk);
        int k=0;
        while(v>0){
            k=k*10+(v%10);
            v/=10;
        }
        if(vk>=0){
            System.out.println(k);
        }
        else{
            System.out.println(-k);
        }
    }
}