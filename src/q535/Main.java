package q535;

import java.util.Scanner;

public class Main {
//	4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
//
//	(C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용) 단 입력는 0이상 4.5 이하이다.
//
//	 
//
//	4.0 이상 : "scholarship"
//
//	3.0 이상 : "next semester"
//
//	2.0 이상 : "seasonal semester"
//
//	2.0 미만 : "retake"​
//
//	 
//
//	>> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();

//		if (a >= 4.0) {
//			System.out.println("scholarship");
//		} else if (a >= 3.0) {
//			System.out.println("next semester");
//		} else if (a >= 2.0) {
//			System.out.println("seasonal semester");
//		} else {
//			System.out.println("retake");
//		}

		switch ((int) a) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;

		}
		sc.close();
	}

}
