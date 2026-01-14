package forMe;

public class Chapter06_aaa02 {

	//필드
	private String brand;
	private String model;
	private int price;
	
	//기본생성자
	public Chapter06_aaa02() {
		// TODO Auto-generated constructor stub
	}
	
	//모든 필드를 초기화하는 생성자
	public Chapter06_aaa02(String brand, String model, int price) {
	    this.brand = brand;      // 필드에 매개변수 값을 대입!
	    this.model = model;
	    this.price = price;
	}

	//getter setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//휴대폰 정보 출력
	public void printInfo() {
		System.out.println();
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("가격: " + price + "원");
	}
	
	//할인 가격 계산 메서드
	public int getDiscountPrice(int rate) {
		int discountPrice = price*(100-rate) /100;
		return discountPrice;
	}
	
	
	
	

}
