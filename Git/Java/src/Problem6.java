import java.util.Scanner;

public class Problem6 {
	public static void main(String args[]) {
		String largest = "";
		int max = 0;
		//Print word with max. no. of vowels
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int length = sc.nextInt();
		String str[] = new String[length];
		System.out.println("Enter the Strings : ");
		for(int i=0;i<length;i++)
		str[i] = sc.next();
		// traverse all elements and check for word having max vowels
		for(int j=0;j<length;j++) {
			int vowels=0;
			for(int k=0;k<str[j].length();k++) {
				if(str[j].charAt(k)=='a' || str[j].charAt(k)=='A')
					vowels++;
				else if(str[j].charAt(k)=='e' || str[j].charAt(k)=='E')
					vowels++;
				else if(str[j].charAt(k)=='i' || str[j].charAt(k)=='I')
					vowels++;
				else if(str[j].charAt(k)=='o' || str[j].charAt(k)=='O')
					vowels++;
				else if(str[j].charAt(k)=='u' || str[j].charAt(k)=='U')
					vowels++;
			}
			if(vowels>max) {
				max = vowels;
				largest = str[j];
			}
		}
		System.out.println("Word with max. no. of vowels is : "+ largest);
	}
}
