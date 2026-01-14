package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		// 방법1: 기본생성자 + 직접 필드 접근
		Student_07 student1 = new Student_07();
		// student1.studentID=1001; // final 변수는 수정 불가 (컴파일 에러)
		
		// public/default 필드는 직접 접근 가능 (캡슐화 X)
		student1.studentName="솔자바";
		student1.address="종로구";
		student1.showStudentInfo();
		
		System.out.println();
		
		
		// 방법2: 오버로딩 생성자 사용 (객체 생성 시 동시 초기화)
		Student_07 student2 = new Student_07("솔데이터", "강남구");
		//출력(showStudentInfo)
		student2.showStudentInfo();
		
		System.out.println();
		
		
		// 방법3: 기본생성자 + getter/setter 메서드 (캡슐화 권장 방식)
		Student_07 student3 = new Student_07();
		
		// setter를 통한 값 설정 (private 필드 접근 시 필수)
		student3.setStudentName("솔데스크");
		student3.setAddress("강서구");
		
		// 출력(showStudentInfo) - 객체 전체 정보 출력
		student3.showStudentInfo();
		
		// getter를 이용한 개별 속성 조회 (특정 값만 꺼내서 사용 가능)
		System.out.print("\n"+student3.getStudentName()+", ");
		System.out.println(student3.getAddress());
	

	}//main

}//class
