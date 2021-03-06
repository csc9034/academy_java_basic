package inheritance.abstrct.person;

/**
 * 일반적인 사람의 정보를 저장하는 클래스
 * --------------------------------------
 * id   : String
 * name : String
 * age  : int
 * --------------------------------------
 * @author CHO
 *
 */
public abstract class Person {

	// 1. 멤버 변수 선언부
	String id;
	String name;
	int age;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자 : 생성자 선언부를 완전히 생략하면
	//					 자동으로 기본 생성자 선언이 들어가짐
	Person() {

	}
	
	// (2) 매개변수를 받는 생성자가 선언되고
	//	   기본 생성자 선언이 누락된 경우는 자동으로
	//	   기본 생성자를 만들어주지 않음
	Person(String id) {
		this();
		this.id = id;
	}
	
	Person(String id, String name) {
		this(id);
		this.name = name;
	}
	
	Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}

	
	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		
		return String.format("아이디 : %s, 이름 : %s, 나이 : %d", id, name, age);
	}
	
	// person 의 정보 출력 메소드
	/**
	 * Person의 정보를 출력 : 메소드 head 만 있고
	 * 구현 부인 메소드 body를 생략하면 추상 메소드로
	 * 만들 수 있다.
	 */
	public abstract void print();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
