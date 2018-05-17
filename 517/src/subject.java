import java.util.Scanner;

public class subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int Korean, Math, Social, Science;
		int s, c;

		System.out.println("과목의 점수를 입력 하시오");

		System.out.print("국어 점수를 입력하시오:");
		Korean = input.nextInt();
		System.out.print("수학 점수를 입력하시오:");
		Math = input.nextInt();
		System.out.print("사회 점수를 입력하시오:");
		Social = input.nextInt();
		System.out.print("과학 점수를 입력하시오:");
		Science = input.nextInt();

		s = (Korean + Math + Social + Science);
		c = (s / 4);

		System.out.println("총점은" + s);
		System.out.println("평균은" + c);
		if (c >= 80)
			System.out.printf("A 입니다");
		else if (c >= 70)
			System.out.printf("B 입니다 ");
		else if (c >= 50)
			System.out.printf("C 입니다");
		else if (c >= 40)
			System.out.printf("D 입니다");
		else
			System.out.printf("F 입니다");

		System.out.printf(" 학점 입니다. \n");

	}

}
