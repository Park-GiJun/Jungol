package q126;

//0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//
//0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//
//홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		while (true) {
			int c = sc.nextInt();
			if (c == 0) {
				break;
			} else if (c % 2 == 1) {
				b++;
			} else if (c % 2 == 0) {
				a++;
			}
		}
		System.out.println("odd : " + b);
		System.out.println("even : " + a);
		sc.close();
	}

}
