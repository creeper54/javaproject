import java.util.Scanner;

public class sadsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String onef;
		String twof;
		String threef;

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �Է��ϼ��� : ");
		onef = sc.nextLine();

		switch (onef) {
		case "����":
			System.out.println("���н�,����,�ǽ���,���ǽ�,ȭ���");
			break;
		case "����":
			System.out.println("������,�Ұ���,�μ��,������,�����");
			break;
		case "����":
			System.out.println("����,�ǽ���,������");
			break;
		case "����":
			System.out.println("����,�л���");
			break;
		case "����":
			System.out.println("�밭��");
			break;
		default:
			System.out.println("����");
		}
	}

}
