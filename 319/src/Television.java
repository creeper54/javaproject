
public class Television {
	
	private int channel;//ä�ι�ȣ
	private int volume;//����
	private boolean onOff;//���� ����
	
	public Television(int i, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}

	void print(){
		System.out.println("ä����"+channel+"�̰� ������ "+volume+"�Դϴ�");
	}

}
 class Television1 {
	 private int channel;//ä�ι�ȣ
	 private int volume;//����
	 private int onOff;//���� ����
	 
	 Television1(int c,int v, boolean o){
		 channel=c;
		 c=v;
		 onOff=0;
	 }
	 void print(){
		String c = null;
		System.out.println("ä����"+channel+"�̰� ������"+c+"�Դϴ�.");

	 }
	 
 }