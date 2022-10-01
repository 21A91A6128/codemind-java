import java.util.*;
class pwcg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=sc.nextInt();
        if(v%2==0 || k%2==0){
            System.out.println("Player 1");
        }
        else{
            System.out.println("Player 2");
        }
    }
}