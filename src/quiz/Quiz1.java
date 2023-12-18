package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //scanner 객체 생성
		
		int sum = 0; //배열의 합을 담아줄 변수 선언
		
		int[] arr = new int[5];//5개의 값을 저정할 배열 선언
		
		//scanner.nextInt를 이용하여 arr의 크기만큼 정수를 입력받아 arr의 각 인덱스에 저장
		for (int i = 0; i < arr.length; i++) {
			int num = scanner.nextInt();
			arr[i] = num;
		}
		
		//배열을 순회하며 sum에 값을 누적해 더해준다.
		for (int i : arr) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	}
}
