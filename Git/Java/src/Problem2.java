import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Net Price of Product");
		float price = sc.nextFloat();
		System.out.println("Enter Tax Rate");
		float tax = sc.nextFloat();
		System.out.println("Gross Price is : "+ (price-(price*tax)));
	}

}
