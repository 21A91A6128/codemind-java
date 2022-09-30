import java.util.Scanner;
class exact_slice{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String vk=sc.nextLine();
			int v=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(vk.substring(v,k+1));
	}
}