import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sv = new Student();

		Scanner scan = new Scanner(System.in);
		System.out.println("���г����� �Է��Ͻÿ�:");
		sv.setGrade(scan.nextInt());

		System.out.println(sv.getGrade());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("������ ���� ���Դ��� ���ÿ�:");
		sv.setGrades(scan2.nextInt());

		System.out.println(sv.getGrades());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("����� ����� ��� ���ÿ�:");
		sv.setAttended(scan3.nextLine());

		System.out.println(sv.getAttended());

	}
}
