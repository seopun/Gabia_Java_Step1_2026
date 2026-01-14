package forMe;

import java.util.Scanner;

public class aaa_1 {

	public static void main(String[] args) {
		/*
    Scanner로 예수금(totalMoney)과 주당 가격(stockPrice)을 입력받으세요.
    살 수 있는 **주식 수(quantity)**를 계산하세요 (/ 연산자).
    매수 후 남는 **잔돈(change)**을 계산하세요 (% 연산자).
    삼항연산자를 사용하여, 잔돈이 0원이면 "알뜰하게 매수 완료!", 아니면 "잔돈 OOO원이 남았습니다."를 출력하세요.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("예수금: ");
		int totalMoney=scan.nextInt();
		
		System.out.print("주당 가격: ");
		int stockPrice=scan.nextInt();
		
		int quantity = totalMoney/stockPrice;
		int change = totalMoney%stockPrice;
		
		System.out.println("주식 수: "+ quantity);
		System.out.println("잔돈: "+change);
		
		boolean result = change>0;
		String a = result ? "잔돈"+change+"원이 남았습니다":"알뜰하게 매수 완료!";
		System.out.println(a);
				
	}

}
