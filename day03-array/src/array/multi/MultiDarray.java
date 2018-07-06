package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		// char[][] 타입의 stars 변수 선언 및 초기화
		char stars[][];
		stars = new char[6][];
		
		// 배열 변수 초기화
		for (int idx = 0; idx < stars.length; idx++){
		stars[idx] = new char[idx+1];
		}
		
		// stars 배열에 데이터 저장
		for (int idx = 0; idx < stars.length; idx++) {
			for (int idx2 = 0; idx2 < stars[idx].length; idx2++) {
				stars[idx][idx2] = '☆';
			}
		}
		
		// stars 배열의 데이터 출력
		for (char[] star : stars) {
			for (char in : star) {
				System.out.printf("%c\t", in);
			}
			System.out.println();
		}
		}
		
	}

