import java.util.*;
class vps{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int vk=sc.nextInt();
            int a=0;
            for(int j=0;j<(vk);j++){
                if(j*j==vk){
                    a=1;
                    break;
                }
            }
            if(a!=0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}