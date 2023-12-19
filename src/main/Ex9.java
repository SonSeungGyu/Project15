package main;

import java.io.FileWriter;
import java.io.IOException;

//writer 는 버퍼를 사용하기 때문에 내용이 바로 출력되지 않아 flush를 이용해주어야함


public class Ex9 {
	public static void main(String[] args) {

		FileWriter fw;
		try {
			// 문자 기반 출력 스트림 생성
			fw = new FileWriter("writer.txt");

			// 문자 하나 출력
			fw.write('A');
			
			//문자열 출력
			fw.write("안녕하세요");
			
			//특수기호 출력
			fw.write('\n');
			
			//배열 출력
			char[] arr = {'a','b','c'};
			fw.write(arr);
			
			//filewriter는 버퍼를 사용하여, 데이터를 모았다가 한번에 출력함
			//버퍼: 데이터를 임시로 저장하는 공간
			fw.flush();//버퍼에 남아있는 데이터 강제로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
