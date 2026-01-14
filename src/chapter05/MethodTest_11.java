package chapter05;

public class MethodTest_11 {

	public static void main(String[] args) { //name이라는 변수에 문자열 저장
		String name = "최백설"; // greet 메서드 호출하면서 name 값을 전달
		// 이때 name의 "값"만 복사해서 넘김
		greet(name);
	}//main
	
	public static void greet(String irum) { // "최백설" 값을 irum이 받음
        // name과 irum은 다른 변수지만, 같은 값을 가짐
        // 매개변수 이름은 뭘 써도 상관없음 (name, irum, x, param 다 OK)
		System.out.println("Hello, " + irum + "~~");
	}//greet

}
//main보다 greet이 뒤에 있어도 작동함 (Java는 전체를 먼저 읽기 때문)

/*
 * C언어:
    위에서 아래로 순차적으로 읽음
    함수를 호출하기 전에 미리 선언되어 있어야 함
    만약 main 위에 greet이 없으면 → 함수 프로토타입 선언 필요
 * 
 * Java:
    컴파일러가 클래스 전체를 먼저 스캔함
    메서드 순서 상관없음
    main 위든 아래든 greet을 찾아서 연결함
 */

