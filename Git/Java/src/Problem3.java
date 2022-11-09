import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]) {
		//Accept two no. and print larger one
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No. : ");
		int first = sc.nextInt();
		System.out.println("Enter the Second No. : ");
		int second = sc.nextInt();
		System.out.println("Largest no is : "+ Math.max(first, second));
	}
}
