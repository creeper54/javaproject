import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sv = new Student();

		Scanner scan = new Scanner(System.in);
		System.out.println("몇학년인지 입력하시오:");
		sv.setGrade(scan.nextInt());

		System.out.println(sv.getGrade());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("시험을 몇점 나왔는지 쓰시오:");
		sv.setGrades(scan2.nextInt());

		System.out.println(sv.getGrades());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("당신의 출결이 어떤지 쓰시오:");
		sv.setAttended(scan3.nextLine());

		System.out.println(sv.getAttended());

	}
}
