import java.util.Scanner;

public class sadsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String onef;
		String twof;
		String threef;

		Scanner sc = new Scanner(System.in);

		System.out.println("몇층인지 입력하세요 : ");
		onef = sc.nextLine();

		switch (onef) {
		case "일층":
			System.out.println("어학실,경비실,실습실,보건실,화장실");
			break;
		case "이층":
			System.out.println("도서관,소강당,인쇄실,행정실,교장실");
			break;
		case "삼층":
			System.out.println("교실,실습실,교무실");
			break;
		case "사층":
			System.out.println("교실,학생부");
			break;
		case "오층":
			System.out.println("대강당");
			break;
		default:
			System.out.println("없음");
		}
	}

}
