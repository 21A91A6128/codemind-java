import java.util.*;
class psrn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0,v=sc.nextInt();
        for(int k=1;k<v;k++){
            if(k*k==v){
                a=1;
                System.out.println("True");
                break;
            }
        }
        if(a==0){
            System.out.println("False");
        }
    }
}