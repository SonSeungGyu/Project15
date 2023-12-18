package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//배열 사용해서 파일 읽기
public class Ex5 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("input3.txt");

			// 배열생성
			byte[] arr = new byte[10];
			
			//읽어들인 요소의 개수 저장
			int size;

			// 파일의 내용을 10 바이트씩 읽어오기
			while (true) {
				//파일의 내용을 읽어서 배열에 저장하고, 읽어온 문자의 크기 반환
				size = fis.read(arr);
				
				//파일의 끝에 도달하면 루프  종료
				if(size == -1) break;
				
				//읽어들인 크기만큼 배열요소를 출력
				for (int i = 0; i < size; i++) {
					System.out.print((char)arr[i]);
				}
				System.out.println(" : " + size + "바이트 읽음");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
