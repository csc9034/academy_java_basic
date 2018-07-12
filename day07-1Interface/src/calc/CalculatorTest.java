package calc;

import static calc.Calculator.*;
/**
 * 산술 연산을 하는 클래스인
 * Calculator 를 테스트한다.
 * @author CHO
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {
		// 1. 선언
		Calculator calc;
		
		// 2. 초기화 : Calcultor() 클래스의 모든 생성자
		//			   정의를 생략하여 기본 생성자가 
		//			   자동 제공됨.
		calc = new Calculator();
		// non-static 영역의 명시적 초기화 : new 사용
		
		// 3. 사용
		// Calculator 클래스의 add() 메소드 사용
		// (1) static -> non-static : 다른 클래스
		int addResult = calc.add(100, 200);
		System.out.println("100 + 200 = " + addResult);
		
		// 본 클래스에 있는 add() 사용
		// 본 클래스 자신의 객체를 생성 후 사용 가능
		// (2) static -> non static : 동일 클래스
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(10,20);
		
		// (3) 동일클래스 안에 static 영역끼리의 호출 : 
		// 		===> 바로 이름만으로 사용 가능
		subtract(30, 20);
		
		// 다른 클래스의 static 영역끼리의 호출 :
		// 		==> 앞에 클래스 이름을 명시
		// (4) static -> static : 다른 클래스
		Calculator.subtract(10.3, 2.5);
		
		// (5) static import 를 사용하여
		// 	   마치 내가 가지고 있는 메소드처럼 호출 가능
		Calculator.multiply(10.3, 5.5);
		multiply(10.3, 5.5);
		
		
	} // end main 
	
	
	// add 메소드 정의 : non-static;
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d", x, y, x + y);
		return x + y;
	}

	public static int subtract(int x, int y) {
		System.out.printf("%d - %d = %d", x, y, x - y);
		return x + y;
	}

}
