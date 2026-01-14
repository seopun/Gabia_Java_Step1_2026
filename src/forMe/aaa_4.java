package forMe;

import java.util.Scanner;

public class aaa_4 {

	public static void main(String[] args) {

		/*
		 * Scanner로 투입한 돈(inputMoney)과 물건 가격(price)을 입력받으세요. (예: 투입 10000원, 물건 3700원)
		 * 거스름돈 총액(change)**을 계산하세요. (6300원)
		 * 이 거스름돈을 500원짜리 몇 개, 100원짜리 몇 개로 줘야 하는지 계산해서 출력하세요.
		 * 힌트: 500원으로 먼저 나누고(count500), 남은 돈을 다시 100원으로 나누세요(count100).
		 * 출력 예시:
		 * text 거스름돈: 6300원 500원 동전: 12개 100원 동전: 3개
		 * (300원이 남는데 500원 12개면 6000원 처리, 나머지 300원은 100원 3개)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("투입한 돈: ");
		int inputMoney = scan.nextInt();
		
		System.out.print("물건 가격: ");
		int price = scan.nextInt();
		
		int change=inputMoney-price;
		
		int count500=change/500;
		int remainder = change % 500;
		int count100=remainder/100;
		
		Boolean result = price<inputMoney;
		String a= result ? "구매성공!":"잔액이 부족합니다.";
		System.out.println(a);
		
		System.out.println("거스름돈: "+change);
		System.out.println("500원 동전: "+count500+"개");
		System.out.println("100원 동전: "+count100+"개");
		
		
		
		
		
		
	}

}
