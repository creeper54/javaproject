import java.awt.*;
import javax.swing.*;

public class gui {
	static class grades extends JFrame{
		grades(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("성적처리프로그램");
			
			this.setLayout(new GridLayout(3,3,10,10));
			
			JButton btn1 = new JButton("이름");
			this.add(btn1);
			
			JButton btn2 = new JButton("국어점수");
				
			this.add(btn2);
			
			JButton btn3 = new JButton("영어점수");
			this.add(btn3);
			
			JButton btn4 = new JButton("수학점수");
			this.add(btn4);

			JTextField txt1= new JTextField(10);
			this.add(txt1);
			
			JTextField txt2= new JTextField(10);
			this.add(txt2);
			
			JTextField txt3= new JTextField(10);
			this.add(txt3);
			
			JTextField txt4= new JTextField(10);
			this.add(txt4);
			
			JButton btn5 = new JButton("추가");
			this.add(btn5);

			JButton btn6 = new JButton("제거");
			this.add(btn6);
			
			JButton btn7 = new JButton("수정");
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
