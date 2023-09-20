package q9006;

public class Main {
	public static void main(String[] args) {
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println("123");
		System.out.println("6.500000");
		
		String a = "수를 출력할 때는 따옴표를 생략합니다.";
		int b = 123;
		double c = 6.5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.printf("%.6f\n", c);
	}
}