package forMe;

public class Chapter06_bbb01 {

	public static void main(String[] args) {
		
		// 방법 1: 기본 생성자 사용 후 setter로 값 설정
		Chapter06_aaa01 book1 = new Chapter06_aaa01();
		book1.setTitle("자바의 정석");
		book1.setAuthor("남궁성");
		book1.setPrice(30000);
		
        // 방법 2: 매개변수 있는 생성자로 바로 초기화
		Chapter06_aaa01 book2 = new Chapter06_aaa01("이펙티브 자바", "조슈아 블로크", 36000);
		Chapter06_aaa01 book3 = new Chapter06_aaa01("토비의 스프링", "이일민", 45000);
        
        // 출력
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
		
        
        // getter로 값 읽어오기
        System.out.println(book1.getTitle() + "의 저자는 " + book1.getAuthor() + "입니다.");
        System.out.println(book2.getTitle() + "의 저자는 " + book2.getAuthor() + "입니다.");
        System.out.println(book3.getTitle() + "의 저자는 " + book3.getAuthor() + "입니다.");
		
		
		
		
	}//main

}
