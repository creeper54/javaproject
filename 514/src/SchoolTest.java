import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();

		Scanner scan = new Scanner(System.in);
		System.out.println("��ȭ��ȣ�Է��ϼ���:");
		sc.setPhonenumber(scan.nextInt());

		System.out.println(sc.getPhonenumber());

		Scanner scan1 = new Scanner(System.in);
		System.out.println("������� ���ÿ�:");
		sc.setClassroom(scan1.nextInt());

		System.out.println(sc.getClassroom());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("�б����� �Է��Ͻÿ�:");
		sc.setSchoolname(scan2.nextLine());

		System.out.println(sc.getSchoolname());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���:");
		sc.setAddress(scan3.nextLine());

		System.out.println(sc.getAddress());

	}

}

