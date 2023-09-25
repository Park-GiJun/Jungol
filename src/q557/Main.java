package q557;

import java.util.Scanner;

public class Main {
//	10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.nextLine();
		String[] arr2 = b.split(" ");
		System.out.println(arr2[0] + " " + arr2[3] + " " + arr2[6]);
		
		System.out.println("-----------------------------------------------");
		 
		char[] arr = new char[10];
		for(int i = 0 ; i <arr.length; i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.println(arr[0] + " " + arr[3] + " "+ arr[6]);		
		sc.close();
	}

}
