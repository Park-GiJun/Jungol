package q613;

import java.util.Scanner;

//"이름", "학교명", "학년"을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
//
//(이름과 학교명은 각각 20자 이하이다.)

class School {
	String name;
	String schoolName;
	int grade;

	public School(String name, String schoolName, int grade) {
		this.name = name;
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + schoolName);
		System.out.println("Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		---------------------------------------
//		
//		School b = new School();
//		
//		b.name = sc.next();
//		b.schoolName = sc.next();
//		b.grade = sc.nextInt();
//		sc.close();
//		
//		System.out.println("Name : " + b.name);
//		System.out.println("School : " + b.schoolName);
//		System.out.println("Grade : " + b.grade);
//		-----------------------------------------

		String name = sc.next();
		String schoolName = sc.next();
		int grade = sc.nextInt();
		School a = new School(name, schoolName, grade);
		
		a.print();
		sc.close();

	}

}
