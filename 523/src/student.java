import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = new int[4];
		int[] rank = new int[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < 4; i++) {
			System.out.print("�л�" + (i + 1) + "�� ���� : ");
			score[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (score[i] < score[j])
					rank[i] = rank[i] + 1;
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("�л�" + (i + 1) + "�� ���� : " + rank[i] + "��");
	   }
	}
}
