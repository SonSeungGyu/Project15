package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {
		
		
		try {
			long start = 0;
			long end = 0;
			
			//입출력 스트립 생성
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy.txt");
			
			//복사를 시작하는 시간 저장
			start = System.currentTimeMillis();
			
			//한문자씩 읽어서 복사하는 중
			while(true) {
				int i = fis.read();
				if(i == -1) break;
				
				fos.write(i);
			}
			
			//복사가 끝나는 시간
			end = System.currentTimeMillis();
			
			System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되없습니다");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
}
