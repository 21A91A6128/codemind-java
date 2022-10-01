import java.util.*;
class paln{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int r=0;
        for(int i=1;i<=vk;i++){
            if(vk%i==0){
                r++;
            }
        }
        if(r==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}