
public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		PerfectBank b4 = new PerfectBank();
		RottenBank b5 = new RottenBank();
		System.out.println("RottenBank�� ������:" + b5.getInterestRate());
		System.out.println("BandBank�� ������:" + b1.getInterestRate());
		System.out.println("NormalBank�� ������:" + b2.getInterestRate());
		System.out.println("GoodBank�� ������:" + b3.getInterestRate());
		System.out.println("PerfectBank�� ������:" + b4.getInterestRate());

	}

}
