package chapter05;

public class FuncTest_Overload_main {

	public static void main(String[] args) {
		
		// 객체 생성: obj는 Stack, 실제 객체는 Heap
		FuncTest_08 obj = new FuncTest_08();
		
		// 컴파일러가 매개변수 타입/개수를 보고 알맞은 메서드를 자동 연결
		obj.getResult(5);              // int 버전 호출
		obj.getResult('A');            // char 버전 호출
		obj.getResult("월요일 입니다."); // String 버전 호출
		obj.getResult(4, "2026");      // int, String 버전 호출
		

	}

}
