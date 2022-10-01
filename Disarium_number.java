import java.util.*;
class disn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int v=vk;
        int k=0;
        int n=(int)(Math.log10(v))+1;
        while(v>0){
            k+=(int)Math.pow(v%10,n);
            n--;
            v/=10;
        }
        if(vk==k){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}