package q560;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0 ; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
		
		//case 2 
		Scanner sc2 = new Scanner(System.in);
		
		int min = 1000;
		for(int i = 0 ; i < 10 ; i++) {
			int a = sc2.nextInt();
			min = Math.min(min, a);
		}
		sc2.close();
		System.out.println(min);
	}

}
