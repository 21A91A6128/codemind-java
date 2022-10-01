import java.util.*;
class sf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int vk=sc.nextInt();
            int r=1;
            while(vk>0){
                r*=vk;
                vk--;
            }
            System.out.println(r);
        }
    }
}