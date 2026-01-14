package chapter02;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 용돈 금액을 입력받으세요. money 2. 용돈을 3명에게 똑같이 나눠줍니다. people 3. 한 명당
		 * 받는 금액을 계산하세요. moneyPerPerson 4. 나머지 금액을 계산하세요. remainder 5. 나머지 금액이
		 * 있으면(hasRemainder) "나머지 ○원은 저금하세요!", 없으면 "딱 떨어집니다!"를 출력하세요. 6. 삼항연산자를 사용하세요.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("용돈을 입력하세요: ");

		int money = scan.nextInt();
		int people = 3;

		// 한 명당 받는 금액
		int moneyPerPerson = money / people;
		System.out.println("한 명당: " + moneyPerPerson + "원");

		// 나머지 금액
		int remainder = money % people;

		// 나머지가 있는지 판별
		boolean hasRemainder = remainder > 0;

		String result = hasRemainder ? "나머지 " + remainder + "원은 저금하세요!" : "딱 떨어집니다!";
		System.out.println(result);

	}

}
