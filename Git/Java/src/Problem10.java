import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

	public static void main(String args[]) {
		//2nd largest no. from Unsorted array;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the Numbers");
		for(int i=0;i<length;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("2nd Largest no is : "+ arr[length-2]);
	}
}
