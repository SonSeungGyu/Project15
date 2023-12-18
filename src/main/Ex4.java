package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) {

		FileInputStream fis = null;

		// 텍스트 파일과 연결된 입력 스트림 생성
		try {
			fis = new FileInputStream("input2.txt");

			// 파일의 내용을 읽다가 파일의 끝에 도달하면 반복문 종료
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기

				// 파일의 끝에 도달하면 -1을 반환
				if (i == -1) {
					break;
				}
				
				//문자로 반환하여 출력
				System.out.println((char)i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
