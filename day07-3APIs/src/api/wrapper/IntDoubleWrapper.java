package api.wrapper;

/**
 * 기본형을 객체형으로 포장하는 포장클래스 중
 * int 		: Integer
 * double	: Double
 * @author CHO
 *
 */
public class IntDoubleWrapper {

	public static void main(String[] args) {
		// (1). 사용할 문자열 변수 선언
		String intInput = "100";
		String dblInput = "200.0";
		
		// (2). String ----> 기본형
		// (.1) parseType   : static 메소드 사용하는 방법
		String intFrm = String.format("문자열[%s] 를 기본형 [%d] 로 변경", intInput, Integer.parseInt(intInput));
		System.out.println(intFrm);

		String doubleFrm = String.format("문자열[%s] 를 기본형 [%3.2f] 로 변경", dblInput, Double.parseDouble(dblInput));
		System.out.println(doubleFrm);

	
		
		// (.2) typeValue() : non-static 메소드 사용
		intFrm = String.format("문자열[%s] 를 기본형 [%d] 로 변경", intInput, new Integer(intInput).intValue());
		System.out.println(intFrm);
		
		doubleFrm = String.format("문자열[%s] 를 기본형 [%3.2f] 로 변경", dblInput, new Double(dblInput).doubleValue());
		System.out.println(doubleFrm);
		
		// (3) 기본형 ----> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStry = new Double(sixty).toString();
		
		// String 변경 확인을 위해 문자열 접합
		tenStr += "입니다.";
		sixtyStry += "입니다.";
		
		// 접합 연산 결과 출력
		System.out.println(tenStr);
		System.out.println(sixtyStry);
		
		// (3) 기본형 <-------> 객체형
		Integer objTen = new Integer(ten);
		Double objSixty = new Double(sixty);
		
		System.out.println(ten + "의 객체형 데이터 : " + objTen);
		System.out.println(sixty + "의 객체형 데이터 : " + objSixty);
	}

}
