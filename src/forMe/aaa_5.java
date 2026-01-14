package forMe;

import java.util.Scanner;

public class aaa_5 {

	public static void main(String[] args) {
		/*
		 * 연습문제 1: 쇼핑몰 배송비 계산
		 * 변수: int price (구매 금액)
		 * 조건:
		 * 50,000원 이상: "무료배송"
		 * 20,000원 이상 ~ 50,000원 미만: "배송비 2500원"
		 * 20,000원 미만: "배송비 5000원"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("총 구매 금액: ");
		int price = scan.nextInt();
		
		String delivery = (price<20000) ? "배송비 5000원":
			              (price>=50000) ? "무료배송":"배송비 2500원";
		System.out.println(delivery);
		
		
		
		
	}

}
