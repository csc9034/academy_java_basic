package control.loop;

/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스 while 을 활용
 * 
 * @author CHO
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int number = 1;
		int sum = 0; // 합 담는 변수

		// 3. 사용
		while (number <= 100) {
			if ((number % 2) == 0) { // number 짝수의 값을 구하는 식
				sum += number;
			}
			number++;

		}

		// 다른 풀이
		number = 0;
		sum = 0;
		while (number <= 100) {
			sum += number;
			number += 2;
		}
		System.out.printf("1 ~ 100 까지의 짝수의 합은 : %d%n", sum);
	}

}
