package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {
	public static void main(String[] args) throws IOException {
		
		// 내 코드
//		File file = new File("C:\\Users\\user\\downloads");
//		printFileName(file); 
		//////////////////////////////////////////////////////
		
		//디렉토리 경로
		String filepath1 = "C:\\Users\\user\\downloads";
		String filepath2 = "C:\\Users\\user";
		
		//출력 스트림 
		FileWriter fw = new FileWriter("file.txt");
		
		//함수 호출
		printName(filepath2, fw);
		
	}

	static void printFileName(File file) {

		File[] files = file.listFiles();
		FileWriter fw;

		try {
			fw = new FileWriter("file.txt");
			for (File dir : files) {
				fw.write(dir.getName() + '\n');
			}
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//선생님 코드
	//매개변수를 두개 받아 main영역에선 변수의 내용만 
	static void printName(String filepath, FileWriter fw) {
		File file = new File(filepath);
		File[] files = file.listFiles();
		
		for(File dir : files) {
			try {
				fw.write(dir.getName() + '\n');
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
