import java.util.Scanner;
public class ArrayProc {
	
	public void getValues(int[] array){
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<array.length; i++){
		System.out.print("성작을 입력하시오:");
		array[i] = scan.nextInt();
	}
 }
	
	public double getAverage(int[] array){
		  double total = 0;
		 for(int i =0;i < array.length; i++)
			 total+= array[i];
		 return total / array.length;
	}
}

class ArrayProcTest{
	final static int STUDENTS = 5;
	
	public static void maon(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.println("평균은 =" + obj.getAverage(scores));	
	}
}
class Box{
	int width, length,height;
	int volume;
	
	Box(int w,int l,int h){
		width = w;
		length =l;
		height = h;
		volume = w* l *h;
	}
	
	Box whosLargest(Box box1,Box box2){
		if( box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
}

class  BoxTest{
	public static void main(String args[]){
		Box obj1 = new Box(10,20,50);
		Box obj2 = new Box(10,30,30);
		
		Box largest = obj1.whosLargest(obj1, obj2);
		System.out.println("("+largest.width + "." + largest.length +"."+largest.height+")");
	}
}
	
