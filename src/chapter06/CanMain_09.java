package chapter06;

import java.util.Scanner;

public class CanMain_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		
		//음료 준비
		Vending ven = new Vending();

		//음료준비 완료
		ven.init();
		
		//돈 투입
		System.out.print("금액>");
		money = Integer.parseInt(scan.nextLine());
		
		//사용 가능한 음료만 출력
		ven.showCans(money);
		
		System.out.println("====================================");
		// 선택한 음료만 출력
		System.out.print("음료 선택>");
		String select = scan.next(); //nextLine()이랑 하는 역할은 같음
		ven.outCan(select); //젠장 이렇게 하면 되는 거였구나. 한참 헤맸네
		
		
		


	}

}
