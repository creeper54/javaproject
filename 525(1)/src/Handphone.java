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
				System.out.println("추가 :0. 친구전번찾기: 1. 종료 : 2.");
				System.out.print("입력: ");
				number = c.nextInt();
			} while ((number < 0) || (number > 2));

			if (number == 2) {
				System.out.println("프로그램이 종료됨");

				break;
			}
			switch (number) {
			case 0:
				System.out.print("이름을 입력하시오:");
				name = c.next();
				System.out.print("나이를 입력하시오:");
				age = c.nextInt();
				System.out.print("전화번호를 입력하시오:");
				phone = c.nextInt();
				String all = age + " " + phone;
				dic.put(name, all);
				break;

			case 1:
				System.out.print("이름 입력: ");
				name = c.next();
				System.out.println(name + " " + dic.get(name));
				break;
			

			}

		}
	}
}