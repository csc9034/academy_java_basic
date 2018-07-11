package inheritance.abstrct.person;

/**
 * 직원의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author CHO
 *
 */
public class Employee extends Person{
	// 1. 멤버 변수 선언부
	String dept;
	
	
	// 2. 생성자 선언부
	Employee() {
		
	}
	
	Employee(String dept) {
		this();
		this.dept = dept;
	}
	
	Employee(String id, String name, int age, String dept) {
		// 부모 클래스의 생성자의 초기화 기능을 빌려오는
		// super() 키워드는 생성자 정의 첫줄에 1번만 가능
		super(id, name, age);
		this.dept = dept;
	}
	
	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		String employeeStr = String.format(", 부서 : %s ", dept);
		
		return "직원 정보   [" + super.toString() + employeeStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
		
	}
}
