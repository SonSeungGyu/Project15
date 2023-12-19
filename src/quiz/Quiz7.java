package quiz;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("quiz7.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			osw.write("프로그래밍");
			
			osw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
