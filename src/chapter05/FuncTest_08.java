package chapter05;

public class FuncTest_08 {

	//멤버변수
	
	//생성자(디폴트 생성자는 생략가능)
	
	// Overloading (오버로딩): 
	// 메서드 이름은 같지만, 매개변수의 타입, 개수, 순서가 다른 경우
	
	public void getResult(int n) {
		System.out.println(n+"은(는) int 입니다.");
	}
	
	public void getResult(char n) {
		System.out.println(n+"은(는) char 입니다.");
	}
	
	public void getResult(String n) {
		System.out.println(n+"은(는) String 입니다.");
	}
	
    // 매개변수 개수가 다른 경우
	public void getResult(int n, String str) {
		System.out.println(n+"은(는) int이고, "+str+"은(는) String 입니다.");
	}
	
    // 매개변수 순서가 다른 경우도 오버로딩 가능
    public void getResult(String str, int n) {
        System.out.println(str + "은(는) String이고, " + n + "은(는) int 입니다.");
    }
	
	

}

//public 클래스라면 다른 패키지에서도 import해서 객체 생성 가능
//생성된 객체는 Heap 메모리에 저장되고, 참조변수를 통해 접근
