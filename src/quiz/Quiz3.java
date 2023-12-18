package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String str = scanner.nextLine();
			if (str.equalsIgnoreCase("stop")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
}
