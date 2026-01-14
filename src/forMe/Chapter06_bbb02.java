package forMe;

public class Chapter06_bbb02 {

	public static void main(String[] args) {
		Chapter06_aaa02 item1 = new Chapter06_aaa02();
		
		item1.setBrand("갤럭시");
		item1.setModel("s23");
		item1.setPrice(500000);
		
		item1.printInfo();
		int discounted = item1.getDiscountPrice(10);
		System.out.println("10% 할인가: "+ discounted+"원");
		System.out.print("---------------------------------");
		

		
		
		Chapter06_aaa02 item2 = new Chapter06_aaa02("갤럭시", "s25", 1000000);
		item2.printInfo();
		int discounted2 = item2.getDiscountPrice(5);
		System.out.println("5% 할인가: "+ discounted2+"원");
		System.out.print("---------------------------------");
		
		
		Chapter06_aaa02 item3= new Chapter06_aaa02();
		item3.setBrand("갤럭시");
		item3.setModel("s24U");
		item3.setPrice(1200000);
		
		item3.printInfo();


		
	}

}
