package control.loop;

/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * 
 * while 구문을 활용
 * 
 * @author CHO
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 1 ~ 100까지 증가시킬 값을 저장하는 변수 선언

		// 3. 사용
		int number = 1;
		int sum = 0;

		while (number <= 100) {
			sum += number;
			number += 2; // ++ : 1씩만 증가
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 : %d%n", sum);

		// 다른 풀이
		number = 1;
		sum = 0;
		while (number <= 100) {
			// number 가 현재 홀수인가?
			if ((number % 2) == 1) {
				sum += number;
			}
			
			number++;
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 : %d%n", sum);
	}

}
