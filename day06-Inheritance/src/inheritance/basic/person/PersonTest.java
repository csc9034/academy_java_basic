package inheritance.basic.person;

/**
 * Person과 상속 관계인 
 * Student, Teacher, Employee 를
 * 테스트하는 클래스이다.
 * @author CHO
 *
 */
public class PersonTest {

	public static void main(String[] args) {
	
		// 1. 선언, 2. 초기화
		Person person = new Person ("P01", "조성철", 25);
		Student student = new Student("S02", "조성철", 25, "경영정보");
		Teacher teacher = new Teacher("T03", "채한나" , 27, "자바");
		Employee employee = new Employee("E04", "백영현" , 26, "글로벌IT경영");
		
		// 3. 사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
	}

}
