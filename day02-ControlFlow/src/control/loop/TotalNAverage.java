package control.loop;

import java.util.Scanner;

/**
 * 점수를 입력 받아 
 * 점수의 합계와 평균을 구하는 클래스
 * 
 * while 활용
 * @author CHO
 *
 */
public class TotalNAverage {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		
		int total = 0; // 합계 변수
		int score = 0; // 점수 변수
		int count = 0; // 반복 변수
		double average;// 평균 변수
		
		// 스캐너 클래스 변수 선언 및 초기화
		Scanner scan = new Scanner(System.in);
		
		// 스캐너를 사용하여 score 값 입력
		System.out.println("점수를 입력(끝내려면 0을 입력): ");
		score = scan.nextInt();
		
		// 3. 사용
		while(score != 0) {
			total += score;
			count++;
			System.out.println("점수를 입력(끝내려면 0을 입력): ");
			score = scan.nextInt();
		}
		if (count == 0) {
			System.out.println("입력 된 값이 없습니다.");
		} else {
			average = (double)total / count;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
		}

	}

}
