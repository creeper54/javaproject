import java.util.HashMap;
import java.util.Scanner;

public class Handphone {

	static String name;
	static int age;
	static int phone;

	public static void main(String[] args) {
		int number;
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner c = new Scanner(System.in);
		while (true) {
			do {
				System.out.println("�߰� :0. ģ������ã��: 1. ���� : 2.");
				System.out.print("�Է�: ");
				number = c.nextInt();
			} while ((number < 0) || (number > 2));

			if (number == 2) {
				System.out.println("���α׷��� �����");

				break;
			}
			switch (number) {
			case 0:
				System.out.print("�̸��� �Է��Ͻÿ�:");
				name = c.next();
				System.out.print("���̸� �Է��Ͻÿ�:");
				age = c.nextInt();
				System.out.print("��ȭ��ȣ�� �Է��Ͻÿ�:");
				phone = c.nextInt();
				String all = age + " " + phone;
				dic.put(name, all);
				break;

			case 1:
				System.out.print("�̸� �Է�: ");
				name = c.next();
				System.out.println(name + " " + dic.get(name));
				break;
			

			}

		}
	}
}