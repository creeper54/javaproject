
public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		PerfectBank b4 = new PerfectBank();
		RottenBank b5 = new RottenBank();
		System.out.println("RottenBank의 이자율:" + b5.getInterestRate());
		System.out.println("BandBank의 이자율:" + b1.getInterestRate());
		System.out.println("NormalBank의 이자율:" + b2.getInterestRate());
		System.out.println("GoodBank의 이자율:" + b3.getInterestRate());
		System.out.println("PerfectBank의 이자율:" + b4.getInterestRate());

	}

}
