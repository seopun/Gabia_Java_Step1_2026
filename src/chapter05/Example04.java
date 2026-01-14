package chapter05;

public class Example04 {
	
	//총점을 구한 후 평균을 구하여 평균을 리턴하기
	
	
    // ===== 핵심 개념 =====
    // 이 메서드는 static이 없음 = "인스턴스 메서드"
    // static이 없으면: 객체를 만들어야만 사용 가능
    // static이 있으면: 객체 없이 바로 사용 가능 (예: Math.random())
    
    // 총점을 구한 후 평균을 구하여 평균을 리턴하기
    // int[] numbers: 배열을 통째로 받아옴 (배열의 주소를 전달받음)
	public double calculateAverage(int[] numbers) { //여기서 numbers는 매개변수. 이름은 상관없음.

		int sum=0; // 0으로 초기화 안 하면 에러남 (지역변수는 자동 초기화 안 됨)
		double average;
		
        // ===== 방법 1: 기본 for문 (주석처리됨) =====
        /*
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // 배열의 각 요소를 하나씩 꺼내서 더함
        }
        average = sum / numbers.length; // 총합 ÷ 개수 = 평균
        return average;
        */
		
		
        // ===== 방법 2: 향상된 for문 (for-each문) =====
        // 문법: for(타입 변수명 : 배열명)
        // 배열에서 자동으로 하나씩 꺼내서 변수에 넣어줌
        // 인덱스(i) 없이 값만 필요할 때 사용하면 편함
		for(int num:numbers) {
			sum +=num;
		}//for
		
		
		System.out.println("합계: "+sum);
		
        // (double)로 형변환: 정수 나눗셈을 소수점 나눗셈으로 바꿈
        // 안 하면 75 ÷ 5 = 15 (소수점 버림)
        // 하면 75 ÷ 5 = 15.0 (정확한 평균)
		double avg=(double)sum/numbers.length;
		
		return avg; // 지역변수. 변수방 이름은 상관없음. return 하면 알아서 main에 넣어줌
		
	}//calculateAverage
	
	
    // ================================================================
    // main 메서드: 프로그램 시작점
    // main은 항상 static이어야 함 (JVM이 객체 생성 없이 실행하기 때문)
    // ================================================================
	public static void main(String[] args) {
		
        // ===== 1단계: 객체 생성 =====
        // 왜 객체를 만들어야 하나?
        // → calculateAverage()가 static이 아니기 때문
        // → static 메서드(main)에서 non-static 메서드를 쓰려면 객체 필수!
		Example04 calculator = new Example04();
        // calculator: 참조변수 (리모컨 같은 것)
        // new Example04(): 실제 객체 생성 (TV 같은 것)
		
        // ===== 2단계: 배열 준비 =====
		int[] numbers = { 5, 10, 15, 20, 25 }; // 배열 선언과 동시에 초기화
        // numbers: 배열의 시작 주소를 가진 참조변수
		
	    // ===== 3단계: 메서드 호출 =====
        // 배열을 메서드에 전달할 때는 이름만 쓰면 됨
        // numbers의 주소가 매개변수로 전달됨 (Call by Reference)
		double average = calculator.calculateAverage(numbers);
        // calculator.메서드명() 형식으로 호출 (인스턴스 메서드 호출법)
        // return된 값(평균)이 average 변수에 저장됨
		
        // ===== 4단계: 결과 출력 =====
		System.out.println("배열의 평균: " + average);

	}//main
	

	
	

}//class
