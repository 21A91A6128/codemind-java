import java.util.Scanner;
class cedk{
    public static void main(String args[]){
        int v,i,r,c=0;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        r=sc.nextInt();
        for(i=0;i<v;i++){
            int k;
            k=sc.nextInt();
            if(k%r==0){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}