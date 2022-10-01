import java.util.*;
class abn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=0;
        for(int r=1;r<v;r++){
            if(v%r==0){
                k+=r;
            }
        }
        if(k>v){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}