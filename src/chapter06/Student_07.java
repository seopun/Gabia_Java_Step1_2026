package chapter06;

public class Student_07 {
  
    // ========== 멤버 변수 ==========
    
    // static: 클래스 변수. 모든 객체가 공유하는 변수임. 객체 생성 없이 Student_07.studentID로 접근 가능
    // final: 상수. 한 번 초기화되면 값 변경 불가
	public static final int studentID= 1000;
	
	public String studentName;
	int grade;
	String address;


    // ========== 생성자 ==========
    
    // 기본 생성자
    // 중요: 생성자 이름은 반드시 클래스명(Student_07)과 정확히 일치해야 함!
	public Student_07() {
		
	}
	
	
    // 오버로딩 생성자
    // 매개변수의 개수나 타입이 다르면 같은 이름의 생성자를 여러 개 만들 수 있음(오버로딩)
    // 이클립스 자동완성: 우클릭 > Source > Generate Constructor using Fields 선택
    // 또는 Alt + Shift + S → O 단축키 사용
	public Student_07(String studentName, String address) {
		// this: 현재 객체를 가리킴. 멤버 변수와 매개변수 이름이 같을 때 구분하기 위해 사용
		this.studentName = studentName;
		this.address = address;
	}
	
	
    // ========== Getter/Setter 메서드 ==========
    // 이클립스 자동완성: 우클릭 > Source > Generate Getters and Setters
    // 또는 Alt + Shift + S → R 단축키 사용
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
    // static 메서드: 객체 생성 없이 Student_07.getStudentid()로 호출 가능
    // static 메서드는 static 변수만 접근 가능함
	public static int getStudentid() {
		return studentID;
	}
	
    // ========== 일반 메서드 ==========
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);
	}
	
	
	
	
}//class