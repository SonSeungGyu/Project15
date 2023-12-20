package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz10 {
	public static void main(String[] args) throws IOException {
		
		String filepath1 = "C:\\sonseunggyu\\workspace\\Project2\\src";
		FileWriter fw = new FileWriter("file.txt");

		printName(filepath1, fw);
	}

	static void printName(String filepath, FileWriter fw) {
		File file = new File(filepath);
		File[] files = file.listFiles();

		for (File dir : files) {
			
			if (dir.isDirectory()) { // 폴더일경우 printName함수를 다시 호출
				try {
					fw.write("---------하위폴더-----------\n");
					fw.write(dir.getName() + '\n');
				} catch (IOException e) {
					e.printStackTrace();
				}
				printName(dir.getPath(), fw);
			} else {
				try {
					fw.write(dir.getName() + '\n');
					fw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
