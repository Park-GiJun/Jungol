package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String[] arr1 = sc.nextLine().split(" ");
		String[] arr2 = sc.nextLine().split(" ");

		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
		System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

		System.out.println("avg" + " " + (Integer.parseInt(arr1[1]) + Integer.parseInt(arr2[1])) / 2 + " "
				+ (Integer.parseInt(arr1[2]) + Integer.parseInt(arr2[2])) / 2);
	}

}
