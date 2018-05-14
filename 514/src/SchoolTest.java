import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();

		Scanner scan = new Scanner(System.in);
		System.out.println("전화번호입력하세요:");
		sc.setPhonenumber(scan.nextInt());

		System.out.println(sc.getPhonenumber());

		Scanner scan1 = new Scanner(System.in);
		System.out.println("몇반인지 쓰시오:");
		sc.setClassroom(scan1.nextInt());

		System.out.println(sc.getClassroom());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("학교명을 입력하시오:");
		sc.setSchoolname(scan2.nextLine());

		System.out.println(sc.getSchoolname());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("주소를 입력하세요:");
		sc.setAddress(scan3.nextLine());

		System.out.println(sc.getAddress());

	}

}

