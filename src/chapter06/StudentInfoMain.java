package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		// → 오버로딩된 생성자를 사용
        // 객체 생성하면서 동시에 필드들 초기화
        // String의 초기값(null) 대신, "최백설" 같은 실제 값을 대입해봄
		StudentInfo_06 studentchoi = new StudentInfo_06(1004, "최백설", 9, "일산동구");
		
		
		//출력
		System.out.println(studentchoi.studentID);
        // name은 private이라 이렇게 직접 접근 불가 (컴파일 에러)
        // System.out.println(studentchoi.studentName);
		System.out.println(studentchoi.grade);
		System.out.println(studentchoi.address);
		
		
		// private 필드는 getter를 통해서만 읽을 수 있게 설계
		System.out.println(studentchoi.getStudentName());
		
		System.out.println("------------------");
		
		// 기본 생성자 사용: 모두 기본값(0, null)에서 시작
		StudentInfo_06 studentKim = new StudentInfo_06();
		
		// public / default 필드는 직접 대입 가능
		studentKim.address = "종로구";
		
		// private인 studentName은 setter로만 변경 가능
		studentKim.setStudentName("김백설");
		
		System.out.println(studentKim.address);
		System.out.println(studentKim.getStudentName());
		
	}

}
