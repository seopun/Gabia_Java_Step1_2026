package forMe;

public class Chapter06_aaa01 {
	
	//=== 필드 ===
	private String title;
	private String author;
	private int price;
	
	//=== 기본 생성자 ===
	public Chapter06_aaa01() {
		
	}
	
	//=== 매개변수 있는 생성자 ===
	public Chapter06_aaa01(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//=== getter/setter ===
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

    //=== 정보 출력 메서드 ===
    public void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("-------------------");
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
} //class
