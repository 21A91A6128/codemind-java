import java.util.*;
class ci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double ci=p*(Math.pow((1+((double)r/100)),t));
        System.out.format("%.2f",ci);
    }
}