import java.awt.*;
import javax.swing.*;

public class hyogun {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout ����");
			
			this.setLayout(new BorderLayout(10,10));
			
			JButton btn1 = new JButton("�Ӹ�");
			this.add(btn1,BorderLayout.NORTH);
			
			JButton btn2 = new JButton("��");
		    this.add(btn2,BorderLayout.WEST);
		    
		    JButton btn3 = new JButton("��");
		    this.add(btn3,BorderLayout.CENTER);
		    
		    JButton btn4 = new JButton("��");
		    this.add(btn4,BorderLayout.EAST);
		    
		    JButton btn5 = new JButton("�ٸ�");
		    this.add(btn5,BorderLayout.SOUTH);
		    
		    setSize(256,256);
		    setVisible(true);
		}
	}

	public static void main (String[]args){
		new MyGUI();
	}
}
