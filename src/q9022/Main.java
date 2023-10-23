package q9022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int aP = ++a;
		int bM = b--;
		int c = ++a + b--;
		System.out.print("a = " + aP + ", " + "b = " + bM + ", ");
		System.out.print("c = " + c);
	}

}
