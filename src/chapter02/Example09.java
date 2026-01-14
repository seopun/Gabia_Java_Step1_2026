package chapter02;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 게임 점수를 입력받으세요.
		 * 2. 점수가 80점 이상이면 골드 레벨, 그렇지 않으면 실버 레벨입니다.
		 * 3. 삼항연산자를 사용하여 레벨을 판정하세요.
		 * 4. "⭐ 골드 레벨!" 또는 "🥉 실버 레벨"을 출력하세요.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("게임 점수: ");
		int num1=scan.nextInt();
		
		// 80점 이상인지 판별하는 변수
		boolean isHighScore = num1>=80;
		
		// 삼항연산자로 레벨 판정
		String level = isHighScore?"⭐ 골드 레벨!" : "🥉 실버 레벨";
		/*String level= ((num1 < 0) || (num1 > 100)) ? "⚠️ 잘못된 입력입니다":
			    	  (num1>=80)?"⭐ 골드 레벨!":"🥉 실버 레벨";*/
		System.out.println(level);
		
		scan.close();
		
		

	}

}
