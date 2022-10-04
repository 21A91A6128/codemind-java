import java.util.*;
class minoa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vk[]=new int[n];
        for(int r=0;r<n;r++){
            vk[r]=sc.nextInt();
        }
        int min=vk[0];
        for(int r=0;r<n;r++){
            if(min>vk[r]){
                min=vk[r];
            }
        }
        if(n==0)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}