import java.awt.*;

import javax.swing.*;

public class grade {

	static class grades extends JFrame {

		grades() {

			setLayout(null);

			setTitle("����ó�����α׷�");

			JLabel jlName, jlKor, jlEng, jlMat;
			JButton jbAdd, jbDel, jbChange;

			add(jlName = new JLabel("�̸�", JLabel.CENTER));
			jlName.setBorder(BorderFactory.createBevelBorder(0));
			jlName.setBounds(10, 10, 120, 50);
			
			add(jlKor = new JLabel("���� ����", JLabel.CENTER));
			jlKor.setBorder(BorderFactory.createBevelBorder(0));
			jlKor.setBounds(10, 70, 120, 50);

			add(jlEng = new JLabel("���� ����", JLabel.CENTER));
			jlEng.setBorder(BorderFactory.createBevelBorder(0));
			jlEng.setBounds(10, 130, 120, 50);

			add(jlMat = new JLabel("���� ����", JLabel.CENTER));
			jlMat.setBorder(BorderFactory.createBevelBorder(0));
			jlMat.setBounds(10, 190, 120, 50);

			add(jbAdd = new JButton("�߰�"));
			jbAdd.setBounds(270, 10, 120, 50);
			
			add(jbDel = new JButton("����"));
			jbDel.setBounds(270, 70, 120, 50);

			add(jbChange = new JButton("����"));
			jbChange.setBounds(270, 130, 120, 50);

			setSize(1000, 300);
			setVisible(true);

		}
	}

	public static void main(String[] args) {
		new grades();

	}

}