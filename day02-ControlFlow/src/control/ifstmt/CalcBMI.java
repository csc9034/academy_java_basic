package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		Scanner scan = new Scanner(System.in);
		double height = 0.0;    // 키 변수
		double weight;    // 몸무게 변수
		double bmi = 0.0; // BMI 변수
		String result; 	  // 판정 변수
		
		// 스캐너를 사용하여 변수 초기화 및 데이터 입력값 받기
		System.out.println("키를 입력해주세요.(입력 후 엔터키를 눌러주세요.)");
		height = scan.nextDouble();
		height = height * 0.01;
		System.out.println("몸무게를 입력해주세요.(입력 후 엔터키를 눌러주세요.)");
		weight = scan.nextDouble();
		
		// BMI 지수 공식을 입력 하여 bmi 변수 초기화
		bmi = weight / (height * height);
		// bmi 판별 하는 else - if구문 작성
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
		
		// 화면 출력
		System.out.printf("키 : %5.2f, 몸무게 : %5.2f => BMI : %5.2f // 결과 : %s%n", height, weight, bmi, result);
	}

}
