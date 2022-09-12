import java.util.Scanner;
class voc{
    public static void main(String args[]){
        char vk;
        Scanner sc=new Scanner(System.in);
        vk=sc.nextLine().charAt(0);
        if (vk == 'a' || vk == 'A' || vk == 'e' || vk  == 'E' || vk == 'i' || vk == 'I' || vk =='o' || vk =='O' || vk == 'u' || vk == 'U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        sc.close();
    }
}