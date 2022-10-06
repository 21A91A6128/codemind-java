import java.util.*;
class saese{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int vk[]=new int[n];
        for(int r=0;r<n;r++){
            vk[r]=sc.nextInt();
        }
        for(int r=0;r<n;r++){
            for(int l=r+1;l<=n;l++){
                if(vk[r]==vk[l-1]){
                    s++;
                }
            }
        }
        System.out.println(s);
    }
}