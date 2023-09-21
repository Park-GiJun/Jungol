package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		sc.close();

		switch (a) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;

		}

		if ("A".equals(a)) {
			System.out.println("Excellent");
		} else if ("B".equals(a)) {
			System.out.println("Good");
		} else if ("C".equals(a)) {
			System.out.println("Usually");
		} else if ("D".equals(a)) {
			System.out.println("Effort");
		} else if ("F".equals(a)) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}

}
