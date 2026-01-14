package chapter05;

public class FuncTest_04 {  // void와 return에 대해 알아보자
	
	// 반환 타입이 int인 메서드
    // void 대신 반환 타입을 지정 → return 문 필수
	public int channelUp(int volume) { //여기서 channelUp 앞의 int는 반환타입을 결정
		System.out.println("현재 소리는 "+volume+"입니다.");
		
        // return: 계산된 값을 호출한 곳으로 반환
        // 메서드 종료 → 스택 프레임 제거
		return volume +10; //호출한 곳으로 반환(후 소멸(스택이므로))
	}//channelUp
	
	// 반환 타입이 void인 메서드
    // void = 반환값 없음, return 문 불필요
	public void channelDown(int volume) {
		System.out.println("현재 소리를 "+volume+"만큼 내립니다.");
        // return문 없음 - void이므로 생략 가능
        // 메서드 끝에 도달하면 자동으로 종료
	}//channelDown
		
	
	//--------------------------------------------------------
	public static void main(String[] args) {
		
        // 객체 생성: tv 참조변수는 Stack, 객체는 Heap
		FuncTest_04 tv = new FuncTest_04();
		
		int volume = 5;
		// 직접 값을 넣어도 되지만, 변수를 사용하면 코드 가독성과 재사용성이 높아짐
		int v=tv.channelUp(volume); // 변수 사용 (권장)
		//    tv.channelUp(5);  // 직접 값 (간단한 경우 사용)
		

		//반환값이 있는 메서드
		//방법 1: 반환값을 변수에 저장
		System.out.println("소리를 "+v+"로 올립니다.");
		System.out.println("-----------------------------------");
		// channelUp의 반환 타입이 int이므로, 받는 변수 v도 int여야 함
		// 반환 타입과 변수 타입이 일치해야 컴파일 오류 없음
		
		
		//방법 2: 반환값을 바로 사용
		System.out.println("소리를 "+tv.channelUp(volume)+"로 올립니다.");
		System.out.println("-----------------------------------");
		
		
		// void 메서드 호출: 반환값이 없으므로 변수에 저장 불가
		tv.channelDown(volume);
		// int x = tv.channelDown(volume);  // 오류! void는 반환값 없음
		
	}//main

}//class

//===== void와 return 정리 =====

//void 메서드:
//- 반환값 없음
//- return 문 생략 가능 (또는 return;만 사용)
//- 호출: 메서드명(); (반환값 저장 불가)
//- 용도: 출력, 상태 변경 등 결과값이 필요 없는 작업

//반환 타입이 있는 메서드 (int, String, boolean 등):
//- 반환값 있음
//- return 값; 필수
//- 호출: 변수 = 메서드명(); 또는 바로 사용
//- 용도: 계산 결과, 조회 결과 등을 반환

//===== 메모리 흐름 =====
//1. tv.channelUp(5) 호출
//2. Stack에 channelUp 프레임 생성, volume=5 저장
//3. return 15 실행 → 호출한 곳에 15 반환
//4. channelUp 프레임 제거 (volume 변수도 함께 소멸)
//5. 반환값 15를 v에 저장 (main의 Stack에)