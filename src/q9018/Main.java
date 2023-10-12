package q9018;


//두 개의 정수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오. 

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("두 개의 수를 입력하시오. ");
		
		int a = sc.nextInt(), b= sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
		
		sc.close();

	}

}
