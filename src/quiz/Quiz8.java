package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\user\\Downloads");
		File[] files = file.listFiles();
		FileWriter fw;
		
		try {
			fw = new FileWriter("file.txt") ;
			for(File dir : files) {
				fw.write(dir.getName()+ '\n');
			}
			
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
