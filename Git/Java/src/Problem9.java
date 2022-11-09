import java.util.Scanner;

public class Problem9 {
	public static void main(String args[]) {
		//Print 2 digit special integer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 digit No. : ");
		int number = sc.nextInt();
		//Check if it is 2 digit no.
		if(String.valueOf(Math.abs(number)).length()==2)
		{
			//Check if this no. is special of not
			int first = number/10;
			int second = number%10;
			if(first+second+(first*second) == number)
				System.out.println("No. entered is a special number");
			else
				System.out.println("No. entered is not a special number");
		}
		else {
			System.out.println("No. isn't a two digit no.");
		}
		
	}
}
