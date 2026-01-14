package chapter05;

public class MethodTest_10 {

	public static void printHello() { 
        // static → main에서 바로 호출하기 위해 필요
        // void → 화면에 출력만 하고 값을 돌려주지 않음
		System.out.println("Hello Java!");
	}//printHello

	public static void main(String[] args) { //프로그램 시작점 (항상 static)
		printHello();
        // static 메서드끼리는 바로 호출 가능
        // 만약 printHello()가 static이 아니었다면:
        // MethodTest_10 obj = new MethodTest_10();
        // obj.printHello(); 이렇게 써야 함
	}//main
	
}
