
public class Animal {
	private double weight;
	String picture;

	void eat() {
		System.out.println("eat()메소드가 호출되었음");
	}

	void sleep() {
		System.out.println("sleep()메소드가 호출되었음");
	}

	void pee() {
		System.out.println("pee() 메소드가 호출되었음");
	}

	void hunt() {
		System.out.println("hunt() 메소드가호출되었음");
	}
}

class Lion extends Animal {
	private int legs = 4;

	void roar() {
		System.out.println("roar()메소드가 호출되었음");
	}
}

class Eagle extends Animal {
	private int wings = 2;

	void fly() {
		System.out.println("wings()메소드가 호출되었음");

	}
}