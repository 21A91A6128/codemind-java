import java.util.*;
class ugn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt(),k=0;
        while(v!=1){
            if(v%2==0){
                v/=2;
            }
            else if(v%3==0){
                v/=3;
            }
            else if(v%5==0){
                v/=5;
            }
            else{
                k++;
                break;
            }
        }
        if(k!=0){
            System.out.println("Not Ugly Number");
        }
        else{
            System.out.println("Ugly Number");
        }
    }
}