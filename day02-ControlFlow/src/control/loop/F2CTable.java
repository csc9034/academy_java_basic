package control.loop;

/**
 * 화씨온도(F) -> 섭씨온도(C)로 변환 C = 5 / 9 * (F-32)
 * 
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도까지 계산 화씨온도 변수 : fah 섭씨온도 변수 : cel
 * 
 * @author CHO
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double fah = 0.0;
		double cel = 0.0;

		// 3. 사용
		for (fah = 0; fah <= 100; fah += 10) {

			cel = (double) 5 / 9 * (fah - 32);
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);

		}


	}

}
