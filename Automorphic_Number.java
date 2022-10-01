import java.util.*;
class autn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int n=((int)Math.log10(vk))+1;
        if(vk==((vk*vk)%(int)Math.pow(10,n))){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}