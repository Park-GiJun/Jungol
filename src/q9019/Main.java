package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.print(arr[0] + 3 + " ");
		System.out.print(arr[1] - 3 + " ");
		System.out.print(arr[2] * 3 + " ");
		System.out.print(arr[3] / 3 + " ");
		System.out.print(arr[4] % 3 + " ");

	}

}
