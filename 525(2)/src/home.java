import java.awt.*;
import javax.swing.*;


public class home {
	static class MyGul extends JFrame{
		MyGul(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("1버튼");
			this.add(btn1);

			JButton btn2 = new JButton("2버튼");
			this.add(btn2);

			JButton btn3 = new JButton("3버튼");
			this.add(btn3);

			JButton btn4 = new JButton("4버튼");
			this.add(btn4);
			
			JButton btn5 = new JButton("5버튼");
			this.add(btn5);
			
			JButton btn6 = new JButton("6버튼");
			this.add(btn6);
			
			JButton btn7 = new JButton("7버튼");
			this.add(btn7);
			
			JButton btn8 = new JButton("8버튼");
			this.add(btn8);
			
			JButton btn9 = new JButton("9버튼");
			this.add(btn9);
			
			JButton btn10 = new JButton("10버튼");
			this.add(btn10);
			
			JButton btn11 = new JButton("11버튼");
			this.add(btn11);
			
			JButton btn12 = new JButton("12버튼");
			this.add(btn12);
			
			JButton btn13 = new JButton("13버튼");
			this.add(btn13);
			
			JButton btn14 = new JButton("14버튼");
			this.add(btn14);
			
			setSize(800,800);
			setVisible(true);
		}
	}
	public static void main(String[] args){
		new MyGul();
	}

}
