
public class Employee {
	private String name;
	private double salary;

	private static int count = 0; // 정적 변수
	// 생성자

	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++; // 정적 변수인 count즐 증가
	}

	// 객채가 소멸 될때 호출된다.
	protected void finalize() {
		count--;
	}

	// 정적 메소드
	public static int getCount() {
		return count;
	}
}
