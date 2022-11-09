import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Problem8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int day = (int)TimeUnit.SECONDS.toDays(sec);        
		long hours = TimeUnit.SECONDS.toHours(sec) - (day *24);
		long minute = TimeUnit.SECONDS.toMinutes(sec) - (TimeUnit.SECONDS.toHours(sec)* 60);
		long second = TimeUnit.SECONDS.toSeconds(sec) - (TimeUnit.SECONDS.toMinutes(sec) *60);
		System.out.println(day+" Day(s) "+hours+" Hour(s) "+minute+" Minute(s) "+second+" Seconds(s)");
	}
}
