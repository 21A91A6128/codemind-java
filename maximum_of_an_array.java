import java.util.*;
class maxoa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vk[]=new int[n];
        int max=-1;
        for(int r=0;r<n;r++){
            vk[r]=sc.nextInt();
            if(max<vk[r])
            {
                max=vk[r];
            }
        }
        System.out.println(max);
    }
}