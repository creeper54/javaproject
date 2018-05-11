import java.util.Scanner;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school sc = new school();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("전화번호입력하세요");
		sc.setPhonenumber(scan.nextInt());
		
		System.out.println(sc.getPhonenumber());
	}

}
