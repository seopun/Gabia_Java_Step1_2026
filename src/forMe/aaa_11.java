package forMe;

import java.text.BreakIterator;
import java.util.Scanner;

public class aaa_11 {

	public static void main(String[] args) {
		/*
		 * 헬스장에서 사용자 나이와 회원 등급을 입력받아, 이용 가능 여부와 월 요금을 출력하는 프로그램을 작성하세요. 나이(age), 회원
		 * 등급(level)을 입력받으세요. 회원 등급: 1(청소년 회원) 2(일반 회원) 3(프리미엄 회원)
		 * 
		 * 월 기본 요금: 18세 미만: 30,000원 18~59세: 50,000원 60세 이상: 40,000원
		 * 
		 * 나이에 따른 가입 제한: 청소년 회원(1): 13세 이상 18세 이하만 가입 가능 일반 회원(2): 18세 이상 가입 가능 프리미엄
		 * 회원(3): 21세 이상 가입 가능
		 * 
		 * 나이가 해당 회원 등급의 최소 조건보다 낮으면 "가입 불가"를 출력하세요. 그 외에는 "가입 가능, 월 요금은 O원입니다."를 출력하세요.
		 * 변수명: int age, int level, int price
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		System.out.print("회원 등급을 입력하세요(1,2,3): ");
		int level = scan.nextInt();
		int price = 0;

		//월 기본 요금
		if (age<18) {
			price = 30000;
		} else if (age <= 59) {
			price = 50000;
		} else {
			price = 40000;
		} // if

		//나이에 따른 가입 제한
		if (level == 1) {
			 System.out.println((age >= 13 && age <= 18) ? "가입 가능, 월 요금은 "+ price+"원입니다" : "가입 불가");
		} else if (level == 2) {
			  System.out.println((age >= 18) ? "가입 가능, 월 요금은 "+ price+"원입니다" : "가입 불가");
		} else if (level==3) {
			 System.out.println((age >= 21) ? "가입 가능, 월 요금은 "+ price+"원입니다" : "가입 불가");
		} else {
		    System.out.println("존재하지 않는 등급입니다.");
		}// if


	}// main

}
