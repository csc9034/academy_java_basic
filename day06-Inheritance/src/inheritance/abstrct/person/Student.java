package inheritance.abstrct.person;

/**
 * 학생의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author CHO
 *
 */
public class Student extends Person {
	// 1. 멤버변수 선언부
	String major;
	
	// 2. 생성자 선언부
	Student() {
		
	}
 	
	Student(String major) {
		this.major = major;
	}
	
	Student(String id, String name, int age, String major) {
		// 부모 클래스의 생성자의 초기화 기능을 빌려오는
		// super() 키워드는 생성자 정의 첫줄에 1번만 가능
		super(id, name, age);
		this.major = major;
	}
	
	// this, this() / super, super()		
	
	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		String studentStr = String.format(", 전공 : %s ", major);
		
		return "학생 정보   [" + super.toString() + studentStr + "]";
	}
	
	@Override
	public void print() {
		System.out.println("== 학생 ==");
		System.out.println(this);
		
	}
}
