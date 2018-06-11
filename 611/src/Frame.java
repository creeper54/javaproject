import javax.swing.*;
import java.awt.FlowLayout;

public class Frame extends JFrame{
	public Frame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		add(button);
		setVisible(true);
	}
	
	public static void main(String[] args){
		  Frame f = new Frame();
	  }
}
