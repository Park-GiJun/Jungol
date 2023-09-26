package q614;

import java.util.Scanner;

//"학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후,
//
//한 개의 변수는 학교명에 "Jejuelementary", 학년에 "6"으로 각각 초기화하고 
//
//다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
//
// 학교명은 20자 이하의 영문자이다.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School a = new School();
		School b = new School();
		
		a.setVar("Jejuelementary", 6);
		b.setVar(school, grade);
		
		a.pP();
		b.pP();
	}
}

class School{
	private String school; 
	private int grade;
	
	public void setVar(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	public void pP() {
		System.out.println(grade + " grade in " + school + " School");
	}
	
}
