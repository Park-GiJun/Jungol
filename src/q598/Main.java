package q598;

//문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 종료하는 프로그램을 작성하시오.

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean a = true;
		while (a) {
			char inp = sc.nextLine().charAt(0);
			if ((inp >= 'A' && inp <= 'Z') || (inp >= 'a' && inp <= 'z')) {
				System.out.println(inp);
			} else if (inp >= '0' && inp <= '9') {
				System.out.println((int) inp);
			} else {
				a = false;
			}
		}
		sc.close();

	}

}
