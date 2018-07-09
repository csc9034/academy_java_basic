package practice.methods;

public class DefineMethodsTest {

	public static void main(String[] args) {
		
		DefineMethods methods;
		methods = new DefineMethods();
		
		methods.printTenTimes(10);
		System.out.println("==================================");
		
		methods.printSomebodysMessage("java is 꿀쨈", "조성철");
		System.out.println("==================================");

		methods.printMessaage("재밌는 자바");
		System.out.println("==================================");
		
		String str = methods.returnOriginalMessage("꿀잼 자바");
		System.out.printf("메시지 : %s%n", str);
		System.out.println("==================================");

		int addResult = methods.addTen(10);
		System.out.printf("계산 값 : %d%n", addResult);
		System.out.println("==================================");

		int subResult = methods.subtractTen(50);
		System.out.printf("계산 값 : %d%n", subResult);
		System.out.println("==================================");

		double doubleResult = methods.makeDouble(23.0);
		System.out.printf("계산 값 : %5.2f%n", doubleResult);
		System.out.println("==================================");
		
		double doubleSubResult = methods.subtractFivePointFive(52.5);
		System.out.printf("계산 값 : %5.2f%n", doubleSubResult);
		System.out.println("==================================");
		
		String name = methods.makeFullName("brett", "CHO");
		System.out.printf("이름: %s%n", name);
		System.out.println("==================================");
		
		int addIntResult = methods.add(10, 20);
		System.out.printf("계산 값 : %d%n", addIntResult);
		System.out.println("==================================");

		double addDoubleResult = methods.add(30.0, 20.0);
		System.out.printf("계산 값 : %5.2f%n", addDoubleResult);
		System.out.println("==================================");

		methods.printMsgManyTimes("자바가 좋아?", 3);
		System.out.println("==================================");

		methods.arithmetic("+", 10, 20);
		System.out.println("==================================");
		
		double arithDouble = methods.arithmetic("+", 10.2, 15.2);
		System.out.printf("계산 값 : %5.2f%n", arithDouble);
		System.out.println("==================================");
		
		boolean isEvenResult = methods.isEven(8);
		System.out.printf("계산 값 : %b%n", isEvenResult);
		System.out.println("==================================");
		
		int absoluteResult = methods.absolute(-8);
		System.out.printf("계산 값 : %d%n", absoluteResult);
		System.out.println("==================================");

		methods.findMultiple(10);
		System.out.println("==================================");

		String decideResult = methods.decideSign(3);
		System.out.printf("결과 : %s%n", decideResult);
		System.out.println("==================================");

		methods.repeatedMessage("윤홍식 짱짱맨", 5);
		System.out.println("==================================");

		double area = methods.calcCircleArea(3);
		System.out.printf("계산 값 : %5.2f%n", area);
		System.out.println("==================================");
		
		int[] multiArray = multiArray = methods.makeMultipleNums(10);
		
		for(int multi : multiArray) {
		System.out.printf("계산 값 : %d%n", multi);
		}
	}

}
