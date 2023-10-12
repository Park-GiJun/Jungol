package q9071;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] inps = new int[10];

		for (int i = 0; i < 10; i++) {
			inps[i] = sc.nextInt();
		}
		Arrays.sort(inps);

		for (int i = 0; i < 10; i++) {
			if (inps[i] % 2 == 1 || inps[i] % 2 == -1) {
				System.out.print(inps[i] + " ");
				break;
			}
		}

		for (int i = 9; 0 < i; i--) {
			if (inps[i] % 2 == 0) {
				System.out.print(inps[i]);
				break;
			}
		}

	}

}
