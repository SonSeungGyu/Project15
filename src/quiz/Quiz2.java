package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리의 정수를 입력하세요");
		int num = scanner.nextInt();
		int sum = 0;
		
		if(num>9 && num<100) {
			sum = (num/10) + (num%10);
		}
		System.out.println(sum);
		
	}
}
