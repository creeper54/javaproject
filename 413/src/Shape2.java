
abstract class Shape2 {
	private int x,y;
	public void move(int x,int y){
	    this.x=x;
	    this.y=y;
   }
     public abstract void draw();
 };
 
 class Rectangle extends Shape2{
	 private int width,height;
	 public void draw(){//�߻� �޼ҵ� ���� 
		 System.out.println("�簢�� �׸��� �޼ҵ�");
	 }
 };
 
class Circle extends Shape2{
	private int radius;
	public void draw(){
		System.out.println("�� �׸��� �޼ҵ�");
	}
};
