
public class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class RottenBank extends Bank {
	double getInterestRate() {
		return 20.0;
	}
}

class BadBank extends Bank {
	double getInterestRate() {
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	double getInterestRate() {
		return 3.0;
	}
}

class PerfectBank extends Bank {
	double getInterestRate() {
		return 1.0;

	}
}