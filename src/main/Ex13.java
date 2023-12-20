package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
		
		//File: 파일 정보를 담는 클래스.
		//파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		
		//newFile.txt와 연결된 파일 클래스 생성
		File dir = new File("C:\\Users\\user\\Downloads");
		
		//폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for(File file : files) {
			System.out.println(file);
		}
		
		//실제 파일 생성
//		try {
//			file.createNewFile();
//			

//			e.printStackTrace();
//		}
		
		//파일 속성 보기
		System.out.println(dir.isFile()); //파일인지?
		System.out.println(dir.isDirectory()); //폴더인지?
		System.out.println(dir.getName()); //파일이름
		System.out.println(dir.getAbsolutePath()); //파일경로
		System.out.println(dir.getPath());//파일경로
		System.out.println(dir.canRead());//읽을수 있는지?
		System.out.println(dir.canWrite());//쓸 수 있는지?
//		
//		//파일 삭제
//		file.delete();
		
	}
}
