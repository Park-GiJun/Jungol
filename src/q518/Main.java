package q518;

//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		sc.close();

		System.out.print("sum : " + (a + b + c) + "\n" + "avg : " + ((a + b + c) / 3));

	}

}
