import java.awt.*;
import javax.swing.*;

public class home {
	static class MyGul extends JFrame {
		MyGul() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout ����");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("1. ����ó ��� ");
			this.add(btn1);

			JButton btn2 = new JButton("2.����ó ���");
			this.add(btn2);

			JButton btn3 = new JButton("3.����ó ���� ");
			this.add(btn3);

			JButton btn4 = new JButton("4. ������");
			this.add(btn4);


			setSize(5000, 5000);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGul();
	}

}
