import java.util.*;
class pnhn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int kv=-1;
        for(int i=1;i<vk-1;i++){
            if(i*(i+1)==vk){
                kv=i;
                break;
            }
        }
        if(kv!=-1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}