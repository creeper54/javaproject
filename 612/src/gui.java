import java.awt.*;
import javax.swing.*;

public class gui {
	static class grades extends JFrame{
		grades(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("����ó�����α׷�");
			
			this.setLayout(new GridLayout(3,3,10,10));
			
			JButton btn1 = new JButton("�̸�");
			this.add(btn1);
			
			JButton btn2 = new JButton("��������");
				
			this.add(btn2);
			
			JButton btn3 = new JButton("��������");
			this.add(btn3);
			
			JButton btn4 = new JButton("��������");
			this.add(btn4);

			JTextField txt1= new JTextField(10);
			this.add(txt1);
			
			JTextField txt2= new JTextField(10);
			this.add(txt2);
			
			JTextField txt3= new JTextField(10);
			this.add(txt3);
			
			JTextField txt4= new JTextField(10);
			this.add(txt4);
			
			JButton btn5 = new JButton("�߰�");
			this.add(btn5);

			JButton btn6 = new JButton("����");
			this.add(btn6);
			
			JButton btn7 = new JButton("����");
			this.add(btn7);
			
			setLayout(new GridLayout(3,3,10,10)); 
			setSize(700,300);
			setVisible(true);
		}
	}
	public static void main (String[]args){
		new grades();
	}

}
