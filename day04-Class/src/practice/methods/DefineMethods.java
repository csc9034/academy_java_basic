package practice.methods;

public class DefineMethods {

	/**
	정수(input) 하나를 메소드 아규먼트로 입력 받아서
	입력 된 정수부터 10씩 증가하는 숫자를
	10번 출력하는 메소드를 작성하시오.
	printTenTimes
	*/

	public void printTenTimes(int input) {
		for (int idx = 1; idx < 11; idx++) {

		System.out.printf("%2d번 째 수 : %d%n", idx, input);
		input = input + 10;

	    }
	}

	/**
	메시지(message) 와 이름(name) 을 메소드 아규먼트로
	입력 받아 [nmae]의 메시지 : [message] 를 출력하는 메소드
	printSomebodysMessage
	*/

	public void printSomebodysMessage(String message, String name){

	    System.out.printf("%s의 메시지 : %s%n", name, message);
	}

	/**
	String 타입의 메시지(message)를 메소드 아규먼트로
	입력 받아서 그 메시지를 출력하는 메소드
	printMessage
	*/

	public void printMessaage(String message) {

	    System.out.printf("메시지 : %s%n", message);
	}

	/**
	String 타입의 메시지(message)를 메소드 아규먼트로
	받아서 그 메시지를 그대로 리턴하는 메소드
	*/
	public String returnOriginalMessage(String message){
	    
	    return message;
	}

	/**
	정수(input) 하나를 메소드 야규먼트로 입력 받아서
	입력된 input + 10 을 계산하여 리턴하는 메소드
	addTen 작성
	*/
	public int addTen(int input) {
	    input += 10;
	 
	    return input;
	}

	/**
	정수(input) 하나를 메소드 야규먼트로 입력 받아서
	입력된 input - 10 을 계산하여 리턴하는 메소드
	subtractTen 작성
	*/
	public int subtractTen(int input) {
	    input -= 10;
	 
	    return input;
	}

	/**
	정수(input) 하나를 메소드 야규먼트로 입력 받아서
	입력된 input * 2 을 계산하여 리턴하는 메소드
	makeDouble 작성
	*/
	public double makeDouble(double input) {
	    input *= 2;
	 
	    return input;
	}

	/**
	실수(input) 하나를 메소드 야규먼트로 입력 받아서
	입력된 input /- 5.5 을 계산하여 리턴하는 메소드
	subtractFivePointFive 작성
	*/
	public double subtractFivePointFive(double input) {
	    input -= 5.5;
	 
	    return input;
	}

	/**
	이름(name), 성(surname) 순서로 메소드 아규먼트로
	입력받아 성 이름 순서로 조합하여 리턴하는 메소드
	makeFullName 이라는 메소드를 작성하시오.
	*/
	public String makeFullName(String name, String surname) {
	    
	    return surname + name;

	}

	/**
	두 개의 정수(x, y)를 메소드 아규먼트로 입력 받아
	두 수를 더한 결과를 리턴하는 메소드 add를 작성하시오.
	*/
	public int add(int x, int y) {

	    return x + y;
	}
	
	/**
	두 개의 실수(x, y)를 메소드 아규먼트로 입력 받아
	두 수를 더한 결과를 리턴하는 메소드 add를 작성하시오.
	 */
	public double add(double x, double y) {
		
		return x + y;
	}

	/**
	메시지(message)와 양의 정수(input)를 메소드 아규먼트로
	입력 받아 메시지를 출력 하되 입력 된 input의 숫자만큼 반복
	출력하며 현재의 반복 횟수를 같이 출력하는 메소드를 작성하시오.
	printMsgManyTimes
	*/
	public void printMsgManyTimes(String message, int input) {
	    for (int idx = 1; idx <= input; idx++) {
		System.out.printf("메시지 : %s , 현재의 반복 횟수 : %d%n"
				  , message, idx);
	    }
	}

	/**
	사칙연산의 기호(+, -, *, /)가 입력 될 연산자(operator)는 
	문자열로 피연산자 (x, y)는 정수로 입력 받아 기호에 따라
	연산을 달리 수행하고 연산 결과를 출력하는 메소드
	arithmetic 을 작성하시오.
	*/

	public void arithmetic(String operator, int x, int y) {

	    if(operator.equals("+")) {
	        System.out.printf("%d + %d = %d%n", x, y, x + y);
	    } else if(operator.equals("-")) {
	        System.out.printf("%d - %d = %d%n", x, y, x - y);
	    } else if(operator.equals("*")) {
	        System.out.printf("%d * %d = %d%n", x, y, x * y);
	    } else if(operator.equals("/")) {
	        System.out.printf("%d / %d = %d%n", x, y, x / y);
	    } else {
		System.out.println("operator 변수를 확인하세요.");
	    }
	}

	/**
	13 번의 메소드를 연산 결과 double 타입으로 리턴하는
	메소드로 변경하시오.
	*/

	public double arithmetic(String operator, double x, double y) {
	    double result = 0.0;

	    if(operator.equals("+")) {
	        result = x + y;
	    } else if(operator.equals("-")) {
	        result = x - y;
	    } else if(operator.equals("*")) {
	        result = x * y;
	    } else if(operator.equals("/")){
	        result = x / y;
	    } 
		
	    return result;
	}

	/**
	정수(input) 하나를 메소드 아규먼트로 입력 받아서
	짝수이며 true를 홀수이면 false 를 리턴하는 홀짝판별
	메소드 isEven 메소드를 작성하시오.
	*/

	public boolean isEven(int input) {
	    boolean result;
	    
	    if(input % 2 == 0) {

		result = true;

	    } else {
		
		result = false;
	    }	
		
	    return result;
	}

	/**
	정수(x)를 매개변수로 입력 받아
	x 의 절댓값을 리턴하는 메소드
	absolute 를 작성하시오.
	*/
	public int absolute(int x) {

	    x = (x > 0) ? x : -x ;
	    return x;
	}

	/**
	정수(x)를 메소드 매개변수로 입력받아
	입력된 값의 배수 중 100이하의 수를
	모두 출력하는 메소드
	find Multiple를 작성하시오.
	*/
	public void findMultiple(int x) {
	    int multi = 0;
	    int count = 1;
	    
	    while(true) {
	        multi = x * count;

		if(multi <= 100) {
		    System.out.printf("%3d x %3d = %3d%n", x, count, multi);
		    count++;
	    } else {
	       break;
	    }
	    }
	}
	/**
	매개변수로 입력된 정수(x) 대하여
	0보다 작으면 "음의 정수"
	0이면 "정수 0"
	0보다 크면 "양의 정수"
	와 같이 정수의 부호판별을 하여
	판별 내용을 문자열로 리턴하는 메소드
	decideSign 을 작성하시오.
	*/
	public String decideSign(int x) {
	    String result;
	    if( x > 0 ) {
		result = "양의 정수";
	    } else if ( x == 0 ) {
	  	result = "정수 0";
	    } else {
		result = "음의 정수";
	    }
	    return result;
	}

	/**
	문자열(message)와 정수(repeat)를 매개변수로
	입력 받아 repeat 크기의 문자열 배열을 만들고
	생성 된 배열의 원소마다 message 를 저장하고
	배열의 내용을 출력하는 메소드 
	repeatedMessage를 작성하시오.
	*/
	public void repeatedMessage(String message, int repeat){
	    String str[] = new String[repeat];
	    
	    for(int idx = 0; idx < str.length; idx++) {
		str[idx] = message;
		System.out.printf("메시지 : %s%n" , str[idx]);
	    }
	}
	/**
	원의 반지름을 매개변수 정수(r) 입력받아
	원의 넓이를 구하여 double 로 리턴하는 메소드
	calcCircleArea 를 작성하시오. (원의 넓이 공식 : pi * r * r)
	*/

	public double calcCircleArea(int r) {
	    final double PI = 3.14;
	    
	    return PI * (double)r * (double)r; 
	}

	/**
	정수(x)를 매개변수로 입력 받아
	입력 된 값의 배수 중 100 이하의 수를
	배열에 저장하고
	그 배열을 리턴하는 메소드
	makeMultipleNums를 저장하시오.
	*/
	public int[] makeMultipleNums(int x) {
	    int length = 100 /x;
	    int[] numbers = new int[length];

	    for (int idx = 0; idx < numbers.length; idx++) {
	     	numbers[idx] = x * (idx + 1);
	    }
	    
	    return numbers;
	}
}
