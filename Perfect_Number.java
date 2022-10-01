import java.util.*;
class pn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int r=0;
        for(int i=1;i<vk;i++){
            if(vk%i==0){
                r+=i;
            }
        }
        if(r==vk){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}