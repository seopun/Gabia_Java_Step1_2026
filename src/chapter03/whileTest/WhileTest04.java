package chapter03.whileTest;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr=scan.nextInt();
			
			//if -> 60점 이상 이면 합격 그밖에 불합격
			//0이하 100초과시 "0~100까지의 점수만 입력 가능합니다.
			
			if(scr<0||scr>100) {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			}else if(scr >= 60) {
				System.out.println("합격");
				break;
			}else {
				System.out.println("불합격");
				break;
			}
			
			
			/*
			if ((scr<=100)&&(scr>=60)) {
				System.out.println("시험에 합격하셨습니다");
			} else if ((0<=scr)&&(scr<60)) {
				System.out.println("시험에 불합격하셨습니다");
			} else {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
			}
			*/
			
			
		}//while
		
		System.out.println("프로그램 종료");
		
		
	}//main

}
