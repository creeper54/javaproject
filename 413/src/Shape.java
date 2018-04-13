
public class Shape {
	private int x;
	private int y;
	
	public Shape(int x,int y){
		System.out.println("Shape()");
		this.x=x;
		this.y=y;
	}
}
class ColorRectangle extends Rectangle{
	String color;
	
	 ColorRectangle(int x,int y, int width,int height,String color){
		super(x,y,width,height);
		System.out.println("ColoredRectangle()");
		this.color=color;
	
	}
	
	public static void main (String[] args){
		ColorRectangle obj=new ColorRectangle(10,10,20,20,"red");
	}
}
class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height){
		super(x,y);
		System.out.println("Rectangle");
		this.width=width;
		this.height=height;	
	}
	double ecalcArea(){
		return width*height;
	}
	
}