package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력 받아 둘 중 큰 값, 작은 값을 구분하는 클래스
 * 
 * @author CHO
 *
 */
public class MinMax {

	public static void main(String[] args) {
		// 1. 선언
		// 입력 받을 변수 선언
		int x, y;
		// 큰 값, 작은 값을 판별하여 저장할 변수 선언
		int min, max;
		Scanner scan;

		// 2 초기화
		// 스캐너 변수 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력(spacebar 로 분리 입력)하세요.");
		
		// 스캐너를 사용하여 x, y 변수에 값을 초기화(입력)
		x = scan.nextInt();
		y = scan.nextInt();

		// 3. 사용 : if ~ else 로직 전개
		// if ~ else 구조를 사용하여 두 값 중
		// 큰 값은 항상 max, 작은 값은 항상 min에 저장
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		// 출력
		System.out.printf("입력 된 두 정수는 %d, %d%n", x, y);
		System.out.printf("작은 값 %d%n", min);
		System.out.printf("큰 값 %d%n", max);
	}

}
