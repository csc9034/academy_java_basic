package control.switchstmt;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 입력 된 자연수가 3의 배수인지 판별하는 클래스
 * 
 * 배수 판단에 switch 구문을 활용
 * 
 * @author CHO
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
		// 1. 선언
		// 입력 받을 값을 저장할 변수
		int input;
		// 입력을 위한 스캐너 변수 선언
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);

		// 스캐너를 사용하여 input 초기화(입력)
		System.out.println("자연수를 입력하세요.");
		input = scan.nextInt();

		// 3. 사용 : input 변수의 값이 3의 배우인지 판단
		// switch 사용
		// 3의 배수 판단 : 나머지 연산
		// 나머지 연산을 위한 연산자 : %

		switch (input % 3) {
		case 0:
			System.out.printf("입력 값 %d는 3의 배수입니다.%n", input);
			break;
		case 1:
		case 2:
			System.out.printf("입력 값 %d는 3의 배수가 아닙니다.%n", input);
			break;

		default:
			System.out.printf("%d(은)는 입력이 잘 못 되었습니다.", input);
			break;
		} // end switch

	} // end main

} // end class