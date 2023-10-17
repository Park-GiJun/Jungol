package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		double ans = pie(a);
		System.out.printf("%.2f",ans);

	}

	public static double pie(int num) {
		return (double) num * num * 3.14;
	}
}
