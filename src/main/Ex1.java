package main;

import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요");
		
		System.out.println("알파벳 하나를 쓰고 [enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i); //a -> 97
			//문자로 사용하려면 형 변환 필요
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
