
public class Box {

	private int width,length,height;
	private boolean empty=false;
	public int getWidth(){
		return width;
	 
    }
	private boolean isEmpty() {
		return empty;
	}
	private void setEmpty(boolean empty) {
		this.empty = empty;
	}
	private int getLength() {
		return length;
	}
	private void setLength(int length) {
		this.length = length;
	}
	private int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	private void setWidth(int width) {
		this.width = width;
	}

public Box()
{
	width = 0;
	length = 0;
	height = 0;
	empty = true;
}

  public Box(int w,int l,int h){	
	  width = w;
	  length=l;
	  height=h;
	  empty = true;
	  
}

}