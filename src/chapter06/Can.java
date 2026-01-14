package chapter06;

public class Can {

	
    // ===== 멤버변수(필드, 인스턴스 변수) =====
    // - 각 Can 객체가 개별적으로 가지는 속성들
	private String canName; // 음료 이름
	private int price;      // 음료 가격
	
	
	//===== 생성자 =====
	
	//기본생성자
	public Can() {
		
	}

	//오버로딩 생성자(단축키로 만들면 빠르다)
	//Alt+Shift+S O
	public Can(String canName, int price) {
		this.canName = canName; // 매개변수 이름과 멤버변수 이름이 같으니 this로 구분
		this.price = price;
	}

	
    // ===== getter =====
    // - private 필드에 안전하게 접근하기 위한 메서드
	//Alt+Shift+S R
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	
	
	
	
	
}//class
