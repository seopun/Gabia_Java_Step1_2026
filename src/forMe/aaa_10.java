package forMe;

import java.util.Scanner;

public class aaa_10 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 나이(age)와 영화 등급(grade)을 입력받아 관람 가능 여부와 요금을 출력하세요. 
		 * 영화 등급: 1(전체), 2(12세),3(15세), 4(청불) 
		 * 요금: 13세 미만 5000원, 13~18세 8000원, 19세 이상 12000원 나이가 영화 등급보다 낮으면
		 * "관람 불가" 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age =scan.nextInt();
		System.out.print("영화의 등급을 입력하세요(전체, 12세, 15세, 청불): ");
		String grade = scan.next();
		int charge=0;
		int minAge = 0;
		
		if (age < 13) {
			charge = 5000;
		} else if (age < 19) {
			charge = 8000;
		} else  {
			charge = 12000;
		}//if
		
		if (grade.equals("전체")) {
		    minAge = 0;
		} else if (grade.equals("12세")) {
		    minAge = 12;
		} else if (grade.equals("15세")) {
		    minAge = 15;
		} else if (grade.equals("청불")) {
		    minAge = 19;
		} else {
		    System.out.println("잘못된 등급입니다.");
		    return;
		}//if
		
		if (age < minAge) {
		    System.out.println("관람 불가");
		} else {
		    System.out.println("관람 가능, 요금은 " + charge + "원입니다.");
		}//if
		

	}// main

}
