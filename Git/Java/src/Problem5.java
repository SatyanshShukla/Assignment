import java.util.Scanner;

public class Problem5 {
	//Calculate income tax
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float incomeTax = 0;
		System.out.println("Enter the Income ");
		int income = sc.nextInt();
		if(income>0 && income<=250000) {
			incomeTax = 0;
		}
		else if(income>250000 && income<=500000) {
			incomeTax = (10*(income-250000))/100;
		}
		else if(income>500000 && income<=1000000) {
			incomeTax = ((20*(income-500000))/100)+25000;
		}
		else if(income>1000000)
			incomeTax = ((30*(income-1000000))/100)+125000;
		System.out.println(incomeTax);
	}
}
