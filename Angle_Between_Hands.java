import java.util.*;
class abh{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String input[]=s.split(":");
        int h=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        double a=Math.abs((h*30)-(11*m)/2.0);
        if(a<360-a)
           if(a>(int)a)
            System.out.printf("%.1f",a);
           else
            System.out.printf("%.1f",a);
        else
           if(360-a>(int)(360-a))
                 System.out.printf("%.1f",360-a);
           else
                 System.out.format("%.1f",(360-a));
    }
}