package forMe;
//2025.12.31. 자습
public class Book {
	
	//===== 지역 변수 =====
	String title;
	String author;
	int price;
	
	
	
	//===== 생성자 =====
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	// 오버로딩 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}



	//===== getter/setter =====
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	//===== 메서드 =====
	public void printInfo() {
		System.out.println("제목: "+title+", 저자: "+author+", 가격: "+price+"원");
	}//printInfo
	
	public void discount(int percent) {
		int discount = (price*percent/100);
		price -= discount;
	}//discount

}//main


/*
main에서 new Book("제목", "저자", 가격) 형태를 보고
→ Book(String title, String author, int price) 생성자가 필요하다고 추론

필드가 뭘 가져야 할지
→ main에서 사용하는 정보(제목, 저자, 가격)를 보고 title, author, price를 필드로 선언

printInfo()가 호출되는 걸 보고
→ void 메서드고, 안에서 System.out.println으로 필드들을 출력하면 되겠다고 설계

book1.getTitle(), book1.getPrice()를 보는 순간
→ getTitle(), getPrice()라는 getter를 만들어야 한다고 판단

discount(int percent)가 호출되고, 할인 후 가격을 다시 출력하는 걸 보고
→ price에서 percent%만큼 빼서 다시 price에 넣는 메서드로 구현
*/
