import java.awt.*;
import javax.swing.*;

public class home {
	static class MyGul extends JFrame {
		MyGul() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("1. 연락처 출력 ");
			this.add(btn1);

			JButton btn2 = new JButton("2.연락처 등록");
			this.add(btn2);

			JButton btn3 = new JButton("3.연락처 삭제 ");
			this.add(btn3);

			JButton btn4 = new JButton("4. 끝내기");
			this.add(btn4);


			setSize(5000, 5000);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGul();
	}

}
