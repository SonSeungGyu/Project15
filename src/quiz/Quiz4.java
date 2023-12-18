package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {
	public static void main(String[] args) {
		byte[] arr = new byte[26];
		byte num = 'A';
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num++;
		}
		try {
			FileOutputStream fos = new FileOutputStream("quiz4.txt");
			fos.write(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
