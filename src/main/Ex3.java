package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		
		//텍스트 파일과 연결된 입력 스트림 생성
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			
			int i = fis.read();
			System.out.println((char)i);
			
			System.out.println(fis.read());
			
			System.out.println(fis.read());
			System.out.println(fis.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
