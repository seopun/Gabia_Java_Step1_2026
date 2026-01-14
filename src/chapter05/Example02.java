package chapter05;

public class Example02 {

	public static void main(String[] args) {
	
		int num1=10;
		int num2=20;
		
		//반환값이 있는 메서드: return으로 계산 결과를 받아옴
		int result=sum(num1, num2);
		System.out.println("반환값 출력: "+result);
		
		//반환값이 없는 메서드: void는 결과를 반환하지 않음
		// 메서드 내부에서 직접 출력 처리
		total(num1, num2); // void 메소드 출력:
		
	}//main
	
	//-----------------------------------------------------------------
	
    // 반환 타입이 int인 메서드
    // 매개변수: int a, int b (가매개변수, parameter)
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// 반환 타입이 void인 메서드
    // void: 반환값 없음, return 문 생략 가능
	public static void total(int a, int b) {
		System.out.println("void 메소드 출력: "+ (a+b));
	}
	

}

/*
 * 메서드 비교 정리
 * 
 * sum() - 반환값 있음 (int):
 *   - return으로 결과 반환
 *   - 호출한 곳에서 결과를 변수에 저장하거나 바로 사용 가능
 *   - 재사용성 높음 (다른 계산에 활용 가능)
 * 
 * total() - 반환값 없음 (void):
 *   - 메서드 내부에서 출력까지 완료
 *   - 호출한 곳에서 결과를 받을 방법 없음
 *   - 출력 전용, 재사용 불가
 * 
 * 메모리 흐름:
 * 1. main()에서 sum(10, 20) 호출
 * 2. Stack에 sum() 프레임 생성, a=10, b=20 저장
 * 3. return 30 실행
 * 4. sum() 프레임 제거, 반환값 30을 result에 저장
 * 5. total(10, 20) 호출
 * 6. Stack에 total() 프레임 생성, 출력 실행
 * 7. total() 프레임 제거, 반환값 없음
 */
