package operator.ternary;

import java.util.Scanner;

/**
 * 삼항연산자 (조건식 ? 값1 : 값2) 를
 * 테스트하는 클래스이다.
 * ----------------------------------------------------
 * 조건식 : 연산 결과는 항상 boolean 타입의 데이터
 * 
 * 값1 : 조건식의 결과가 true 일 때 선택되는 값
 * 값2 : 조건식의 결과가 false 일 때 선택되는 값
 * ----------------------------------------------------
 * 수학적 절대값 계산을 사용하여 테스트한다.
 * 
 * @author CHO
 *
 */
public class TernaryTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int x = 10;
		int y = -10;
		
		// x, y 변수에 들어있는 값의 절대값을 저장할 변수
		int absX = (x < 0) ? -x : x;
		int absY = (y < 0) ? -y : y;
		
		
		// 3. 사용
		System.out.println("x = " + x + ", absX = " + absX);
		System.out.println("y = " + y + ", absY = " + absY);
		System.out.printf("x = %d 일 때, x의 절대 값은 %d%n", x, absX);
		System.out.printf("x = %d 일 때, y의 절대 값은 %d%n", y, absY);
		
		// 스캐너를 사용하여 입력 받은 값의 절대값을 구해보자
		// 1. 스캐너, 새 변수 선언
		Scanner scan; // ctrl + shift + O => import문 자동 생성
		int z;
		int absZ;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		z = scan.nextInt();
		
		absZ = (z < 0) ? -z : z;
		
		// 3. 사용
		System.out.printf("z = %d 일 때, z의 절대 값은 %d%n", z, absZ);
		
	}

}
