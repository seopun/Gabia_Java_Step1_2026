package forMe;

import java.util.Scanner;

public class aaa_6 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 나이(age)와 등록 개월 수(months)를 입력받으세요.
		 * 2. 기본 월 회원권은 50,000원입니다.(basePrice)
		 * 3. 나이에 따른 할인율을 적용하세요.
		 *    - 20세 미만: 30% 할인 (basePrice * 70 / 100)
		 *    - 60세 이상: 40% 할인 (basePrice * 60 / 100)
		 *    - 그 외: 정상가 (basePrice)
		 * 4. 총 결제 금액을 계산하세요.(monthlyPrice * months)
		 * 5. 6개월 이상(isLongTerm) 등록이면 장기 할인 15% ((totalPrice * 85) / 100)를 추가로 적용하세요.
		 * 6. 삼항연산자를 활용하여 할인 적용 여부를 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age=scan.nextInt();
		int basePrice = 50000;
		int price = (age<20)?(basePrice * 70 / 100):
			        (age>=60)?(basePrice * 60 / 100):basePrice;
		
		System.out.println("월 회원권은 "+price+"(원)입니다.");
		System.out.println();
		
		System.out.print("등록 개월 수를 입력하세요: ");
		int months=scan.nextInt();
		
		boolean isLongTerm = months>=6;
		int totalPrice = isLongTerm ? (price*months*85/100):(price*months);
		
		System.out.println("총 결제 금액은 " + totalPrice + "(원)입니다.");
		String result = isLongTerm ? "장기 할인 15%가 적용된 가격입니다":"";
		System.out.println(result);
		
				
		
		
		
		
		

	}

}
