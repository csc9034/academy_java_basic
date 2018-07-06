package array.multi;

import java.util.Scanner;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차시까지) 별로 
 * 배열에 입력하고 전체 합산 점수가 
 * 가장 높은 선수의 인덱스와 점수를 출력
 * 
 * @author CHO
 *
 */
public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];   // SCORE 2차원 배열 변수 선언 및 초기화
		int[] sum = new int[3];			// SCORE의 SUM을 받는 배열 변수 선언 및 초기화
		int max = 0;					// SUM의 최댓값을 담기 위한 변수 선언 및 초기화

		// 각 선수별로 과녁 점수를 입력 받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.println((idx + 1) + "번째 선수 점수 입력");
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				score[idx][idx2] = scan.nextInt();
				sum[idx] += score[idx][idx2];
				
				// 3명의 선수 중 SCORE의 합계 중 최댓값인 선수를 판별하는 if구문
				if (idx == 0) {
					max = sum[idx];
				} else if (sum[idx] > sum[idx - 1]) {
					max = sum[idx];
				}
			}
		}
		
		// sum[]의 데이터 출력하기
		for (int idx = 0; idx < score.length; idx++) {
			if (sum[idx] == max) {
				max = sum[idx];
				System.out.printf("%d번째 선수 우승", idx + 1);
			}
		}
	}

}
