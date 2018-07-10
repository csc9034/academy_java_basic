package eraser.one;

/**
 * 칠판 지우개를 정의하는 클래스
 * ----------------------------------------------------------
 * 칠판 지우개의 속성을 정의하기 위하여
 * 가로 : width   : double
 * 세로 : height  : double
 * 높이 : depth   : double
 * 겹   : layer   : int
 * 네 개의 멤버 변수 선언
 * ----------------------------------------------------------
 * 기본 생성자 : 매개변수를 받지 않는 생성자
 * 매개변수를 받는 생성자 두 개를 정의
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서
 * 매개변수를 받도록 정의한다.
 * ----------------------------------------------------------
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 	 : peal()  : void
 * ----------------------------------------------------------
 * @author CHO
 *
 */
public class Eraser {
	// 1. 멤버 변수 선언
	/** 칠판 지우개 가로 */
	double width;
	
	/** 칠판 지우개 세로 */
	double height;
	
	/**  칠판 지우개 높이 */
	double depth;
	
	/** 칠판 지우개 겹 수*/
	int layer;
	
	// 2. 생성자 선언부
	/** 
	 * 기본 생성자
	 */
	Eraser() {
		
	}

	/**
	 * 칠판 지우개 클래스의 네 개의 필드 모두를 매개변수로 
	 * 입력 받아필드 값을 초기화 시키는 메소드
	 * @param newWidth
	 * @param newHeight
	 * @param newDepth
	 * @param newLayer
	 */
	Eraser(double newWidth, double newHeight, double newDepth, int newLayer) {
		width = newWidth;
		height = newHeight;
		depth = newDepth;
		layer = newLayer;
	}
	
	
	// 3. 메소드 선언부
	/**
	 * 칠판 지우개의 상태를 나타내는 네 개의 필드의
	 * 정보를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("가로 : %3.2f, 세로 : %3.2f, 높이 : %3.2f, 겹 : %d%n", width, height, depth, layer);
	}
	
	/**
	 * layer를 한 겹을 제거하는 메소드
	 * if 구문을 사용하여 값을 체크
	 */
	public void  peal() {
		if ((layer - 1) >= 0) {
		layer -= 1;
		}
	}

}
