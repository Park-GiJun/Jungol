package q540;

//정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
//
//3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
//
//-1이 입력되면 종료하는 프로그램을 작성하시오.
//
// 
//
//아래 출력 예시에서 (입력) (출력)은 실제 입출력하는 부분이 아니고,  입력인지 출력인지를 구분하기 위한 표시이다.

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			if (a % 3 == 0) {
				System.out.println(a / 3);
			} else if (a == -1) {
				sc.close();
				break;
			}
		}

	}

}
