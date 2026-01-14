package chapter06;

public class Product {

	// ===== 필드 =====
	String name;
	int price;
	float discountRate;
	// 필드는 별도 대입이 없어도
    //   int    -> 0
    //   float  -> 0.0f
    //   String -> null
    // 같은 기본값으로 자동 초기화된다.
	
	
	
	// ===== 생성자 =====
	
	// 1. 기본 생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	// 2. 상품명 + 가격 생성자
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 3. 모든 값 생성자
	public Product(String name, int price, float discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	

	// ===== 메서드 =====
	
    // 할인된 가격 계산
    // - "현재 price와 discountRate를 이용해 할인된 가격을 계산해서 돌려주는 함수" 역할.
    // - 필드로 discountPrice를 따로 두지 않고,
    //   호출 시점마다 실시간으로 계산하므로 항상 최신 상태를 얻을 수 있다.
    // - 이 메서드가 값을 반환(return)하기 때문에,
    //   showInfo() 말고도 다른 메서드나 main에서 재사용할 수 있다.
	public int getDiscoutPrice() {
		return (int)(price - (price * discountRate));
	}//getDiscoutPrice
	
    // 상품 정보 출력
    // - 필드에 직접 접근해서 원가, 할인율을 출력하고,
    //   할인된 가격은 getDiscoutPrice()를 호출해서 가져온다.
    // - 이렇게 하면 "할인 가격 계산 로직"이 한 곳(getDiscoutPrice)으로 모이므로,
    //   나중에 계산 방식이 바뀌어도 그 메서드만 수정하면 된다.
	public void showInfo() {
		System.out.println("상품명: " + name + " | 원가: " + price + " | 할인율: " + discountRate + " | 할인된 가격: " + getDiscoutPrice());
	}//showInfo

}



//★ 필드 기본값 & 식 초기화 정리
//- 필드는 값을 안 넣어도 타입별 기본값(0, 0.0f, false, null)으로 자동 초기화된다.
//- 선언할 때 한 번만 식으로 초기값을 줄 수도 있다.
//  예) int discountPrice = (int)(price - price * discountRate);
//- 하지만 이 식은 '객체가 생성될 때 한 번만' 계산된다.
//이후에 price나 discountRate가 바뀌어도 discountPrice는 자동으로 다시 계산되지 않기 때문에,
//항상 최신 값을 쓰고 싶다면 이렇게 필드로 두기보다는
//getDiscoutPrice() 같은 메서드로 계산 로직을 분리하는 것이 더 안전하다.