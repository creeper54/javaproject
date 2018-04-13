
public class Shape3 {
	protected int x, y;
}

class Rectangle extends Shape3 {
	private int width, height;

}

class Triangle extends Shape3 {
	private int base, height;
}

class Circle extends Shape3 {
	private int radius;
}

class Shape3Test {
	public static void main(String arg[]) {
		Shape3 s1, s2;

		s1 = new Shape3(); // 당연하다.
		s2 = new Rectangle();// Rectangle 객체를 Shape 변수로 가리킬 수 있을까?

 }

}
