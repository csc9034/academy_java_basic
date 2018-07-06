package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1 ~ 5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * 
 * @author CHO
 *
 */
public class BestPicher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5]; //방어율 2차원 배열 선언 및 초기화 
		double min = 10.0; //  min 변수 선언

		// 각 팀별로 각 투수의 방어율을 입력 받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		
		// ERA 배열에 데이터 입력하기
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.print((idx + 1) + "번째 팀 1 ~ 5선발 투수 방어율 :");

			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble(); 

				if (ERA[idx][idx2] < min) { // ERA가 가장 낮은 방어율 찾는 if 구문
					min = ERA[idx][idx2];
				}
			}
		}
		
		// ERA 배열에 데이터 출력하기 (가장 낮은 방어율의 팀과 몇번째 선발)
		System.out.println("최고의 투수는");
		for (int idx = 0; idx < ERA.length; idx++) {

			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if (ERA[idx][idx2] == min) {
					System.out.printf("%d번째 %d선발이 최고의 투수!!!", idx+1, idx2+1);
				}
			}
		}
	}
}