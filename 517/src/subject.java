import java.util.Scanner;

public class subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int Korean, Math, Social, Science;
		int s, c;

		System.out.println("������ ������ �Է� �Ͻÿ�");

		System.out.print("���� ������ �Է��Ͻÿ�:");
		Korean = input.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�:");
		Math = input.nextInt();
		System.out.print("��ȸ ������ �Է��Ͻÿ�:");
		Social = input.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�:");
		Science = input.nextInt();

		s = (Korean + Math + Social + Science);
		c = (s / 4);

		System.out.println("������" + s);
		System.out.println("�����" + c);
		if (c >= 80)
			System.out.printf("A �Դϴ�");
		else if (c >= 70)
			System.out.printf("B �Դϴ� ");
		else if (c >= 50)
			System.out.printf("C �Դϴ�");
		else if (c >= 40)
			System.out.printf("D �Դϴ�");
		else
			System.out.printf("F �Դϴ�");

		System.out.printf(" ���� �Դϴ�. \n");

	}

}
