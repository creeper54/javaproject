import java.awt.*;
import javax.swing.*;

public class ehyogun {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 1");

			Container c = this.getContentPane();
			c.setBackground(Color.LIGHT_GRAY);

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("��ư1");
			btn1.setBackground(Color.blue);
			btn1.setForeground(Color.MAGENTA);
			this.add(btn1);

			JButton btn2 = new JButton("��ư 2");
			btn2.setFont(new Font("�������", Font.BOLD, 30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			btn2.setToolTipText("�� ��ư�� ũ�� ������~~");
			this.add(btn2);
			
			JButton btn3 = new JButton("��ư3");
			btn3.setEnabled(false);
			this.add(btn3);
			
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[]args){
		new MyGUI();
	}

}
