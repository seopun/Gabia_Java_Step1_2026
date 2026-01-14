package chapter05;

public class FuncTest_07 { // call by Value

	public static void swap(int x, int y) {
        // 교체 알고리즘 (Swap Algorithm)
        // x <- y, y <- x (임시변수 temp 사용)

		int temp = x;
			   x = y;
			   y = temp;

		System.out.println("swap() 결과값: x=" + x + ", y=" + y);

	}// swap
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("swap()호출전 a:" + a + ", b:" + b);
		System.out.println("----------------------");
		
	    // static 메서드이므로 객체 생성 없이 바로 호출 가능
		swap(a, b); // call by Value
		System.out.println("----------------------");
		
        // 중요: 자바는 Call by Value(값에 의한 호출)입니다.
        // a와 b의 '값'만 복사되어 전달되었으므로, 원본 변수 a, b는 변하지 않습니다.
		System.out.println("swap()호출후 a:" + a + ", b:" + b);
		
		

	}

}

/*
 * Call by Value vs Call by Reference
 * 
 * Call by Value (Java 방식):
 *   - 값만 복사해서 전달
 *   - 메서드 내에서 매개변수 변경해도 원본 변수는 불변
 *   - 기본형(int, double 등)은 항상 값만 복사
 * 
 * Call by Reference (C++, C# 일부):
 *   - 변수의 주소를 전달
 *   - 메서드 내에서 매개변수 변경하면 원본도 변경
 *   - Java는 이 방식 지원 안 함!
 * 
 * Java에서 변수 값을 실제로 교환하려면:
 *   1. 배열 사용: swap(arr, 0, 1)
 *   2. 객체 사용: 객체의 필드 값 변경
 *   3. 반환값 활용: a = swap(a, b)[0], b = swap(a, b)[1]
 */
