import java.awt.*;
import javax.swing.*;


public class home {
	static class MyGul extends JFrame{
		MyGul(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout ����");
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("1��ư");
			this.add(btn1);

			JButton btn2 = new JButton("2��ư");
			this.add(btn2);

			JButton btn3 = new JButton("3��ư");
			this.add(btn3);

			JButton btn4 = new JButton("4��ư");
			this.add(btn4);
			
			JButton btn5 = new JButton("5��ư");
			this.add(btn5);
			
			JButton btn6 = new JButton("6��ư");
			this.add(btn6);
			
			JButton btn7 = new JButton("7��ư");
			this.add(btn7);
			
			JButton btn8 = new JButton("8��ư");
			this.add(btn8);
			
			JButton btn9 = new JButton("9��ư");
			this.add(btn9);
			
			JButton btn10 = new JButton("10��ư");
			this.add(btn10);
			
			JButton btn11 = new JButton("11��ư");
			this.add(btn11);
			
			JButton btn12 = new JButton("12��ư");
			this.add(btn12);
			
			JButton btn13 = new JButton("13��ư");
			this.add(btn13);
			
			JButton btn14 = new JButton("14��ư");
			this.add(btn14);
			
			setSize(800,800);
			setVisible(true);
		}
	}
	public static void main(String[] args){
		new MyGul();
	}

}
