import java.util.Scanner;
class rob{
    public static void main(String args[]){
        int v,i,c=0;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        for(i=0;i<v;i++){
            int k;
            k=sc.nextInt();
            c+=k;
        }
        System.out.println(c);
        sc.close();
    }
}