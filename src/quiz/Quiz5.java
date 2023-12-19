package quiz;


import java.io.FileWriter;
import java.io.IOException;

//정수에 공백을 더해주면 문자열로 인식

public class Quiz5 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("quiz5.txt");
			
			for(int i = 1; i<11;i++) {
				if(i%2 ==0) {
					fw.write(i + " ");
				}
				
			}
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
