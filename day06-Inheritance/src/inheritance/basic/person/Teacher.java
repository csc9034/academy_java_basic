package inheritance.basic.person;

/**
 * 선생님의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author CHO
 *
 */
public class Teacher extends Person{
	// 1. 멤버 변수 선언
	String subject;
	
	// 2. 생성자 선언부
	Teacher() {
	
	}
	
	Teacher(String subject) {
		this();
		this.subject = subject;
	}
	
	Teacher(String id, String name, int age, String subject) {
		// 부모 클래스의 생성자의 초기화 기능을 빌려오는
		// super() 키워드는 생성자 정의 첫줄에 1번만 가능
		super(id, name, age);
		this.subject = subject;
	}


	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목 : %s ", subject);
		
		return "선생님 정보 [" + super.toString() + teacherStr + "]";
	}
	
}
