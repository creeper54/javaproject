import java.awt.*;
import javax.swing.*;
public class grade {

	static class grades extends JFrame {
		grades() {
			setLayout(null);
			setTitle("����ó�����α׷�");

			JLabel jlName, jlKor, jlEng, jlMat;
			JTextField jtName, jtKor, jtEng, jtMat;
			JButton jbAdd, jbDel, jbChange;
	

			add(jlName = new JLabel("�̸�", JLabel.CENTER));
			jlName.setBounds(10, 10, 120, 50);
			add(jtName = new JTextField());
		    jtName.setBounds(140, 10, 120, 50);

			add(jlKor = new JLabel("���� ����", JLabel.CENTER));
			jlKor.setBounds(10, 70, 120, 50);
			add(jtKor = new JTextField());
			jtKor.setBounds(140,70,120,50);

			add(jlEng = new JLabel("���� ����", JLabel.CENTER));
			jlEng.setBounds(10, 130, 120, 50);
			add(jtEng = new JTextField());
			jtEng.setBounds(140,130,120,50);

			add(jlMat = new JLabel("���� ����", JLabel.CENTER));
			jlMat.setBounds(10, 190, 120, 50);
			add(jtMat = new JTextField());
			jtMat.setBounds(140,190,120,50);

			add(jbAdd = new JButton("�߰�"));
			jbAdd.setBounds(270, 10, 120, 50);

			add(jbDel = new JButton("����"));
			jbDel.setBounds(270, 70, 120, 50);

			add(jbChange = new JButton("����"));
			jbChange.setBounds(270, 130, 120, 50);

            JTable table;

			String [] filename = {"�̸�","����","����","����","����","���"};
			String [][] data = 	{
			{"","","","","",""},
			{"","","","","",""},
			};		

			table = new JTable(data,filename);

			JScrollPane sp = new JScrollPane(table);

			add(sp);
			sp.setBounds(400, 10, 600, 200);
	
			setSize(1025, 300);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new grades();
	}
}