package chapter05;

public class MethodTest_12 {

	public static void main(String[] args) {
		int sum = add(5,7); // int add 메서드 호출 → 5, 7은 "실매개변수"
		// 결과값 12를 받아서 sum 변수에 저장
		
		double sumDouble = add(3.5, 7.2); // double add 메서드 호출
		 // 같은 이름 add이지만 타입이 달라서 다른 메서드가 실행됨

		System.out.println("합계(int): " + sum);
		System.out.println("합계(double): " + sumDouble);
	}//main
	
	
	// Overloading (오버로딩): 같은 이름, 다른 타입/개수의 메서드
	
	//정수의 합
	public static int add(int a, int b) { // a, b는 "가매개변수" (형식매개변수)
        // 매개변수 이름(a, b)은 자유롭게 지정 가능
        // 하지만 타입(int)은 정확해야 함!
		
		int result=a + b; // 5 + 7 = 12
		
		// return a+b; // 이렇게 바로 반환해도 됨
		return result; // 계산 결과를 호출한 곳으로 돌려줌
	}//add
	
	public static double add(double a, double b) { // 같은 이름이지만 타입이 다름
		// 이것도 a, b라는 이름을 썼지만, 위의 a, b와는 완전히 별개
		
		return a+b; // 3.5 + 7.2 = 10.7 반환
	}//add

}//class
