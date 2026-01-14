package chapter05;

public class Example01 {
	/*
	 * 사각형의 넓이를 계산하는 메소드 calculateArea 를 오버로딩 하여 가로와 세로길이, 그리고 한 변의 길이를 받아서 계산할 수 있게
	 * 만들어보세요. 
	 * 사각형 넓이 계산(직사각형) = 가로 x 세로(매개변수 2개) 가로 5, 세로 3 
	 * 사각형 둘레 계산(정사각형) = 한 변의 길이 x 4
	 */
	
	
	public static void main(String[] args) { // main 옆의 static void는 고정 형식

		// 객체 생성:  calculateArea가 static이 아니라서 객체 필요
		Example01 rectangle = new Example01();
		
		// 실매개변수 5, 3을 넘김 → 매개변수 2개인 calculateArea 호출
		double area1 = rectangle.calculateArea(5, 3);
		 //5, 3은 int지만 double 매개변수로 자동 변환됨 (int → double 가능)
		 // double이 int보다 표현 범위가 크기 때문. 반대(double → int)는 명시적 형변환 필요
		
		// 실매개변수 4를 넘김 → 매개변수 1개인 calculateArea 호출 (오버로딩)
		double area2 = rectangle.calculateArea(4);
				
		System.out.println("직사각형의 넓이: " + area1);
		System.out.println("정사각형의 둘레: " + area2);
		
	}//main
	
	//-------------------------------------------------------------------------
	
	public double calculateArea(double a, double b) {
		// static 없음 → 객체로만 호출 가능
        // double 반환 타입 → return 필수
        // a, b는 가매개변수 (형식매개변수)
		return a*b; // 계산 결과를 호출한 곳으로 돌려줌
	}//calculateArea
	
	public double calculateArea(double a) {
		// 같은 이름 calculateArea지만 매개변수 개수가 다름
        // Java가 호출 시 자동으로 구분함
		return a*4;
	}//calculateArea
	
	
		
		

}//class

//void가 있으면 "값"을 return할 수 없음 (하지만 return;만으로 메서드를 중간에 종료는 가능)
//void가 아니면(int, double 등) 반드시 해당 타입의 값을 return해야 함

//static이 있으면 "인스턴스 변수"를 사용할 수 없음 (하지만 지역 변수 선언은 가능)
//static이 없으면 반드시 객체를 생성해야 메서드를 호출할 수 있음

//int를 double로 받는 것 자체는 할 수 있음. double이 더 크니까. 반대는 안 됨.
