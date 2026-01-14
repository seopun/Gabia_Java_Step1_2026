package chapter03.forTest;

public class For09 {

	public static void main(String[] args) {

		for (int item = 1; item <= 3; item++) {

			String name = "";
			int price = 0;

			if (item == 1) {
				name = "연필";
				price = 500;
			} else if (item == 2) {
				name = "공책";
				price = 1000;
			} else {
				name = "지우개";
				price = 300;
			}

			System.out.println("=== " + name + " ===");

			for (int count = 1; count <= 5; count++) {
				System.out.println(name + " " + count + "개: " + (price * count) + "원");

			} //in for
			System.out.println();
		} //out for

		/*
		 * System.out.println("=== 연필 ==="); for(int i=1;i<=5;i++) { for(int j=500;
		 * j<=5000;j*=500) { System.out.println("연필 "+i+"개: "+(i*j));
		 * 
		 * }
		 * 
		 * } System.out.println("=== 공책 ==="); for(int i=1;i<=5;i++) { for(int j=1000;
		 * j<=5000; j*=1000) { System.out.println("공책 "+i+"개: "+(i*j));
		 * 
		 * }
		 * 
		 * } System.out.println("=== 지우개 ==="); for(int i=1;i<=5;i++) { for(int j=300;
		 * j<=5000;j*=300) { System.out.println("지우개 "+i+"개: "+(i*j));
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int i; System.out.println("=== 연필 ===");
		 * 
		 * for (i = 1; i <= 5; i++) { System.out.println("연필 " + i + "개: " + (500 * i) +
		 * "원"); } // for
		 * 
		 * System.out.println("");
		 * 
		 * System.out.println("=== 공책 ===");
		 * 
		 * for (i = 1; i <= 5; i++) { System.out.println("공책 " + i + "개: " + (1000 * i)
		 * + "원"); } // for
		 * 
		 * System.out.println("");
		 * 
		 * System.out.println("=== 지우개 ===");
		 * 
		 * for (i = 1; i <= 5; i++) { System.out.println("지우개 " + i + "개: " + (300 * i)
		 * + "원"); } // for
		 */

	}// main

}
// class
