package q127;

//0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
//
//그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
//
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		boolean a = true;
		int cnt = 0;
		int sum = 0;
		while (a) {
			int inp = sc.nextInt();
			if (inp >= 0 && inp < 101) {
				sum += inp;
				cnt++;
			} else {
				break;
			}
		}
		System.out.println("sum : " + sum);
		System.out.print("avg : ");
		System.out.printf("%.1f\n",(double) sum / cnt);

	}

}
