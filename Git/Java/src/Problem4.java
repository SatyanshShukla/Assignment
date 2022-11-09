import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int length = sc.nextInt();
		if(length==0) {
			System.out.println("Median is : "+(-1.0));
		}
		else {
			float arr[] = new float[length];
			System.out.println("Enter the Elements : ");
			for(int i=0;i<length;i++)
			arr[i] = sc.nextFloat();
			if(length%2==0) {
				System.out.println("Median is :"+(arr[(length/2)+1]+arr[(length/2)])/2);
			}
			else {
				System.out.println("Median is :"+arr[(length/2)]);
			}
		}
		
		
	}
}
