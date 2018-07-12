package school;

/**
 * 선생님의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author CHO
 *
 */
public class Teacher extends Person implements Lesson{
	// 1. 멤버 변수 선언
	private String subject;
	
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
	
	/** subject 필드 접근자 */
	public String getSubject() {
		return subject;
	}

	/** subject 필드 수정자 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 3. 메소드 선언부
	// toString() 재정의
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목 : %s ", subject);
		
		return "선생님 정보 [" + super.toString() + teacherStr + "]";
	}
	
	@Override
	public void print() {
		System.out.println("== 선생님 ==");
		System.out.println(this);
	}
	
	public String attend() {
		// 교사 [아이디] 가 출근하였습니다.
		String teaStr = String.format("교사 [%s] (이)가 출근하였습니다.", this.getId());
		
		return teaStr;
	}
	
	@Override
	public String lesson() {
		// 교사[아이디] (이)가 과목[과목명] 수업을 하고 있습니다.
		return String.format("학생[%s] (이)가 과목[%s] 수업을 듣고 있습니다.", this.getId(), this.getSubject());
	}
}
