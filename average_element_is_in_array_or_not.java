import java.util.*;
class aoa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),f=0;
        int vk[]=new int[n];
        int avg=0;
        for(int r=0;r<n;r++){
            vk[r]=sc.nextInt();
            avg+=vk[r];}
        avg=avg/n;
        for(int r=0;r<n;r++){
            if(avg==vk[r]){
                f=1;
                break;}
        }
        if(f==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}