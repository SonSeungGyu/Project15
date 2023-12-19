package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {
	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("reader.txt");
			while (true) {
				int i = fis.read(); //1바이트씩 읽기
				if(i == -1) break;
				
				System.out.print((char)i);//한글은 1byte로 표현할 수 없어서
			}
			
			System.out.println();
			//문자기반 입력스트림 생성
			FileReader fr = new FileReader("reader.txt");
			while (true) {
				int i = fr.read(); //한 문자 2바이트씩 읽기
				if(i == -1) break;
				
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
