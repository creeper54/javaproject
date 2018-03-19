
public class Television {
	
	private int channel;//채널번호
	private int volume;//볼륨
	private boolean onOff;//전원 상태
	
	public Television(int i, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}

	void print(){
		System.out.println("채널은"+channel+"이고 볼륨은 "+volume+"입니다");
	}

}
 class Television1 {
	 private int channel;//채널번호
	 private int volume;//볼륨
	 private int onOff;//전원 상태
	 
	 Television1(int c,int v, boolean o){
		 channel=c;
		 c=v;
		 onOff=0;
	 }
	 void print(){
		String c = null;
		System.out.println("채널은"+channel+"이고 볼륨은"+c+"입니다.");

	 }
	 
 }