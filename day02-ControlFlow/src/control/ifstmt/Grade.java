package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 90점 이상 A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지 F
 * 
 * 입력 된 점수에 대해 학점을 계산하는 클래스를 작성
 * 입력 int
 * 학점 char 타입을 사용할 것
 * @author CHO
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		
		// 2. 초기화
		// 스캐너 변수 초기화
		Scanner scan = new Scanner(System.in);
		
		// 스캐너를 이용하여 score 변수 초기화
		System.out.println("0~100 사이의 정수를 입력하세요");
		score = scan.nextInt();
		
		// 3. 사용 : score 에 입력된 값을 판단
		if(score >= 90) {
			grade = 'A'; 
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 출력
		System.out.printf("%d점에 해당하는 학점은 : %c 입니다.", score, grade);
	}

}
