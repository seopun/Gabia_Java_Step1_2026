package chapter06;

public class StudentInfo_06 {

    // 멤버변수(필드)
    // 기본값: int는 0, String은 null로 자동 초기화됨
	int studentID;          // 학번
	private String studentName; // 학생 이름 (private: 이 클래스 안에서만 직접 접근 가능)
	int grade;              // 학년
	String address;         // 주소
	
	
    // 기본 생성자 (매개변수 없음)
    // 아무것도 안 적었지만, 객체 생성은 가능하며
    // 필드는 기본값(0, null 등)으로 채워진 상태가 됨
	public StudentInfo_06() {
		
	}
	

    // 생성자 오버로딩
    // 같은 이름의 생성자지만, 매개변수 목록이 다름
    // → 객체를 만들 때 바로 원하는 값으로 초기화 가능
	// source -> generate Constructor using Fields를 통해 자동 완성 가능
	public StudentInfo_06(int studentID, String studentName, int grade, String address) {
        // super();  // 부모 클래스(Object)의 생성자를 부르는 코드
        // 생략해도 컴파일러가 자동으로 맨 처음에 집어넣음
        // 상속 관계에서는 부모 생성자를 먼저 호출해야 하기 때문
		
		this.studentID = studentID;   // this.studentID: 멤버변수, 오른쪽 studentID: 매개변수
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}
	
	
    // ===== getter / setter =====
    // private으로 막아둔 studentName에 대해
    // 값을 "읽을 때"는 getter,
    // 값을 "바꿀 때"는 setter를 통해 접근함 (간접 접근)
	
	public String getStudentName() { // getter: 이름을 리턴
		return studentName;
	}
	public void setStudentName(String studentName) { // setter: 이름을 설정
		this.studentName = studentName;
	}
	


}//class

// setter는 클래스 안에 정의된 메서드이므로, 그 메서드가 없으면 main에서 객체.setXXX(...)를 호출할 수 없음
