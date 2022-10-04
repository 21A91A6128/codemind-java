import java.util.*;
class aoa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vk=0;
        for(int r=0;r<n;r++)
            vk+=sc.nextInt();
        System.out.format("%.2f",(float)vk/n);
    }
}