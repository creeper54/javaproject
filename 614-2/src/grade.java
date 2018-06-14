import java.awt.*;
import javax.swing.*;
public class grade {

	static class grades extends JFrame {
		grades() {

			setLayout(null);
			setTitle("성적처리프로그램");

			JLabel jlName, jlKor, jlEng, jlMat;
			JTextField jtName, jtKor, jtEng, jtMat;
			JButton jbAdd, jbDel, jbChange;
			
			add(jlName = new JLabel("이름", JLabel.CENTER));
			jlName.setBorder(BorderFactory.createBevelBorder(0));
			jlName.setBounds(10, 10, 120, 50);
			add(jtName = new JTextField());
		    jtName.setBounds(140, 10, 120, 50);

			add(jlKor = new JLabel("국어 점수", JLabel.CENTER));
			jlKor.setBorder(BorderFactory.createBevelBorder(0));
			jlKor.setBounds(10, 70, 120, 50);
			add(jtKor = new JTextField());
			jtKor.setBounds(140,70,120,50);

			add(jlEng = new JLabel("영어 점수", JLabel.CENTER));
			jlEng.setBorder(BorderFactory.createBevelBorder(0));
			jlEng.setBounds(10, 130, 120, 50);
			add(jtEng = new JTextField());
			jtEng.setBounds(140,130,120,50);
			
			add(jlMat = new JLabel("수학 점수", JLabel.CENTER));
			jlMat.setBorder(BorderFactory.createBevelBorder(0));
			jlMat.setBounds(10, 190, 120, 50);
			add(jtMat = new JTextField());
			jtMat.setBounds(140,190,120,50);
			
			add(jbAdd = new JButton("입력"));
			jbAdd.setBounds(270, 10, 120, 50);

			add(jbChange = new JButton("수정"));
			jbChange.setBounds(270, 70, 120, 50);

			add(jbDel = new JButton("삭제"));
			jbDel.setBounds(270, 130, 120, 50);

			setSize(1025, 300);
			setVisible(true);
			
			JTable table;
			
			String [] filename = {"이름","국어","수학","사회"};
			String [][] data = 	{
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
					{"","","",""},
			};		
			table = new JTable(data,filename);
			JScrollPane sp = new JScrollPane(table);
			
			add(sp);
			sp.setBounds(400, 0, 600, 200);
		}
	}

	public static void main(String[] args) {
		new grades();
		


	}

}