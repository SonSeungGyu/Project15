package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//FileOutputStream 이용하기
public class Ex6 {
	public static void main(String[] args) {
		
		try {
			//파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("output.txt");//파일이 없으면 자동으로 생성해줌
			
			byte a = 65;//65 -> A문자로 변환되어 저장됨
			byte b = 66;
			
			fos.write(a); //1바이트씩 파일에 저장
			fos.write(b);
			fos.write('c');//그대로 저장됨
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
