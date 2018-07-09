package practice.methods;

/**
 * 메소드 작성 실습 클래스
 * 
 * @author CHO
 *
 */
public class VarietyMethods {

	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}

	/**
	 * 매개변수로 유명인(명사)의 이름을 입력(name) 받고 그 사람이 한 유명한 문구(maxim)를 입력 받아
	 * 
	 * 000(이)가 말하길 "....." 라고 하였다. 라는 문장을 출력하는 메소드 maxims를 정의하라
	 */

	public void maxims(String name, String maxim) {
		System.out.printf("%s 이(가) 말하길%n\"%s\" 라고 하였다.", name, maxim);
	}
	


	/**
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력 받아
	 * 
	 * OOO는 XXXX년 XX월 생입니다.
	 * 
	 * 라는 문장으로 출력하는 메소드 birthYearMonth 라는 메소드를 디자인
	 * 
	 * @param name : String
	 * @param year : int
	 * @param month : int
	 */

	public void birthYearMonth(String name, int yaer, int month) {
		System.out.printf("%s는 %d년 %d월 생입니다.%n", name, yaer, month);
	}
	
	/**
	 * 출력할 단의 숫자를 입력 받아 해당 단의 구구단을 출력하는 메소드
	 * 
	 * 출력의 첫 줄에 X 단 이라는 제목을 출력
	 * 
	 * printNineNineTable 디자인
	 * 
	 * @param stage : int
	 */
	
	public void printNineNineTable(int stage) {
		
		for (int idx = 1; idx < 10; idx ++) {
			System.out.printf("%d X %d = %d%n", stage, idx, stage * idx);
		}
		
	}
 	
	
	
	/**
	 * 출력할 단의 숫자를 가지고 있는 int 배열을
	 * 매개변수로 입력 받아
	 * 입력된 배열의 원소인 각 숫자에 대해
	 * 구구단을 출력하는 메소드
	 * printNineNineTableArray 디자인
	 * @param stage : int 배열
	 */
	
	public void printNineNineTableArray(int[] stage) {
		
		for (int idx = 0; idx < stage.length; idx++) {
			for (int idx2 = 1; idx2 < 10; idx2++) {
				System.out.printf("%d X %d = %d%n", stage[idx], idx2, stage[idx] * idx2);
			}
		}
	}
	
	
	/**
	 * 입력된 화씨온도를 섭씨온도로 변환하여
	 * 변환된 섭씨온도를 리턴하는 메소드
	 * fahToCel 디자인
	 * 
	 * 변환 공식 : 5 / 9 * (F - 32)
	 * 
	 * @param fah : double : 변환할 화씨 온도 값
	 * @return 변환 된 섭씨 온도 값
	 */
	
	public double fahToCel(double fah) {
		return (double)5 / 9 * (fah - 32);
	}
	
	
	/**
	 * 키(cm), 몸무게(kg)를 매개변수로 입력 받아
	 * BMI 지수를 계산하여 비민도 판정 결과를 리턴하는 메소드
	 * calcBmi 디자인
	 * 
	 *	BMI = 몸무게(kg) / 키(m)의 제곱
	 * 
	 * 15.0 미만			병적인 저체중
	 * 15.0이상 18.5미만 	저체중
	 * 18.5이상 23.0미만	정상
	 * 23.0이상 27.5이하    과체중
	 * 27.5초과 40.0dlgk    비만
	 * 40.0초과				병적인 비만
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return 비만도 판정 결과 문자열
	 */
	public String calcBmi(double height, double weight) {
		String result; 	  // 판정 변수
		height = height * 0.01;
		double bmi = weight / (height * height);

		if (bmi < 15) {
			result = "병적인 처제중";
		} else if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23.0) {
			result = "정상";
		} else if (bmi <= 27.5) {
			result = "과체중";
		} else if (bmi <= 40.0) {
			result = "비만";
		} else {
			result = "병적인 비만";
		}
		return result;
	}
	
	/**
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * max 디자인
	 * @param input1
	 * @param input2
	 * @return : 둘 중 큰 정수
	 */
	
	public int max(int input1, int input2) {
		int max;
		max = (input1 > input2) ? input1 : input2; 
		return max;
	}
	
	
	/**
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * min 디자인
	 * @param input1
	 * @param input2
	 * @return : 둘 중 작은 정수
	 */
	
	public int min(int input1, int input2) {
		int min;
		min = (input1 < input2) ? input1 : input2; 
		return min;
	}
	
	
	
	/**
	 * 정수가 저장된 int 배열을 입력 받아
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * sumOfArray 디자인
	 * @param numbers
	 * @return numbers 배열의 각 원소의 합
	 */
	public int sumOfArray(int numbers[]) {
		int sum = 0;
		for (int idx = 0; idx < numbers.length; idx++) {
			sum += numbers[idx]; 
		}
		return sum;
	}
	
	
	
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력 받아
	 * 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드
	 * avgOfArray 디자인
	 * @param numbers
	 * @return numbers 배열의 각 원소의 평균
	 */
	public double avgOfArray(int numbers[]) {
		int sum = 0;
		double avg = 0.0;
		
		for (int idx = 0; idx < numbers.length; idx++) {
			sum += numbers[idx]; 
		}
		avg = (double)sum / numbers.length;
		
		return avg;
	}
	
	/**
	 * char 타입의 연산자와 두 개의 정수를
	 * 매개변수로 입력 받아
	 * 
	 * 입력된 연사자가 '+' 일 때만
	 * 두 정소의 합을 구하여 덧셈의 결과를 출력하는 메소드 
	 * adder 를 디자인
	 * @param op : char
	 * @param x : int
	 * @param y :int
	 */
	public void adder(char op, int x, int y) {
		
		if (op == '+') {
			
			System.out.printf("%d + %d = %d%n", x, y, x + y);
		
		} else {
			
			System.out.println("매개변수를 '+'으로 입력해주세요.");
		
		}
	}
	
}