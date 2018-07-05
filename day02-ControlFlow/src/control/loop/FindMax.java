package control.loop;

import java.util.Scanner;

/**
 * 입력된 자연수 중 최대값을 찾아보자
 * 
 * do ~ while 을 활용
 * 
 * @author CHO
 *
 */
public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max;

		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);
		max = 0;
		
		// 3. 사용
		do {
			System.out.println("양수를 입력(끝내려면 0 입력)");
			input = scan.nextInt();
			
			if (input > max) {
				max = input;
			}
		} while (input > 0);
		
		System.out.printf("최대값은 %d 입니다.", max);
	}

}
