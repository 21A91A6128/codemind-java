import java.util.*;
class adn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int r=(int)(Math.log10(vk));
        int n=sc.nextInt();
        int v=vk%((int)(Math.pow(10,n)));
        int k=vk/((int)(Math.pow(10,r-n+1)));
        System.out.print(Math.abs(v-k));
    }
}