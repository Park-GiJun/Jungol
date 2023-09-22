package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double sum = 0;

		while (true) {
			int a = sc.nextInt();
			sum += a;
			count += 1;
			if (a >= 100) {
				System.out.println((int) sum);
				System.out.printf("%.1f %n", sum / count);
				sc.close();
				break;
			}
		}
		
	}
}