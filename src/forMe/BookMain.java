package forMe;
//2025.12.31. 자습
public class BookMain {

	public static void main(String[] args) {

        // 책 2권 생성
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        Book book2 = new Book("토비의 스프링", "이일민", 45000);

        // 책 정보 출력
        book1.printInfo();
        book2.printInfo();

        // 가격 할인 적용
        book1.discount(10);  // 10% 할인
        book2.discount(20);  // 20% 할인

        // 할인 후 가격 다시 출력
        System.out.println("=== 할인 후 가격 ===");
        System.out.println(book1.getTitle() + " : " + book1.getPrice() + "원");
        System.out.println(book2.getTitle() + " : " + book2.getPrice() + "원");

        
        
        
	}//main
}//class
