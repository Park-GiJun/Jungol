package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		System.out.println(Math.max(a, b) - Math.min(a, b));

	}

}
