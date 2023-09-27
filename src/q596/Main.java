package q596;

import java.util.Scanner;

//문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.
//
// 만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.
//
//(문자열 길이는 최대 100자 이하이다. )

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int b = sc.nextInt();
		sc.close();

		String[] arr = a.split("");
		String[] newArr = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			newArr[arr.length - 1 - i] = arr[i];
		}
		if (newArr.length <= b) {
			b = newArr.length;
		}
		for (int j = 0; j < b; j++) {
			System.out.print(newArr[j]);
		}

	}

}
