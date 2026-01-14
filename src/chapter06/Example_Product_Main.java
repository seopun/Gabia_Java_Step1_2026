package chapter06;

public class Example_Product_Main {

	public static void main(String[] args) {

		// 1. 기본 생성자
		Product p1 = new Product();
		p1.name = "마우스";
		p1.price = 20000;
		p1.discountRate = 0.05f;
		p1.showInfo();

		System.out.println("----------------------------------------------------------------");

		// 2. 상품명 + 가격 생성자
		Product p2 = new Product("키보드", 50000);
		p2.showInfo();

		System.out.println("----------------------------------------------------------------");

		// 3. 모든 값 생성자
		Product p3 = new Product("노트북", 1000000, 0.2f);
		p3.showInfo();

	}

}
