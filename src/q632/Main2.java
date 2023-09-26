package q632;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[3];

		for (int i = 0; i < 3; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(ar);
		System.out.println(ar[0]);
	}
}
