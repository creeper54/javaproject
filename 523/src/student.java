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
			System.out.print("학생" + (i + 1) + "의 점수 : ");
			score[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (score[i] < score[j])
					rank[i] = rank[i] + 1;
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("학생" + (i + 1) + "의 순위 : " + rank[i] + "등");
	   }
	}
}
