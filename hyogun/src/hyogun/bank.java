package hyogun;

/*돈을받을때 0원이상 스캐너로값을 입력받어라*/

public class bank {
	private String name;
	private int balance;
	private int regNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
    }
}