import java.util.Scanner;

public class Problem1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("No. of Digits are : "+ String.valueOf(Math.abs(n)).length());
	}
}
