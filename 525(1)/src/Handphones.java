import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Handphones {
	static String fname = "C: \\temp\\juso.txt";
	
	static class address{
		String name;
		String age ;
		String phone;
		
		address(String s1 ,String s2, String s3){
			this.name = s1;
			this.age = s2;
			this.phone =s3;
		}	
	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String select="";
		System.out.printf("\n### 模备 楷遏贸 包府 ###\n");
		
		while (select !="4"){
			print_menu();
			select = sc.next();
			
		switch(select){
		case "1":
			view_juso();
			break;
		case "2"
		     add juso();
		    break;
		case "3"
		     delet_
		  
		}
		}
	}
}

