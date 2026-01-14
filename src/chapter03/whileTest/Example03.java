package chapter03.whileTest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run=true; //switch, 제어 플래그 패턴
		int balance=0; // 예금(+), 출금(-)

		Scanner scan=new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			// nextLine()로 받으면 엔터로 발생되는 줄을 무시
			int num=Integer.parseInt(scan.nextLine());
			//nextInt()로 받으면 정수만 num에 입력되고 엔터를 입력하는 순간 한줄이 버퍼에 담김
			//이후에 scan.nextLine()를 사용하면 버퍼의 한 줄을 가져와서 에러 발생
			
			if (num<1||num>4) {
				System.out.println("숫자를 잘못 입력하셨습니다");
				System.out.println("");
				continue;
			}//if
		
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				int money=Integer.parseInt(scan.nextLine());
				
				if(money<0) {
					System.out.println("잘못된 입력입니다");
				} else {balance+=money;
				}
				System.out.println("");
				break;
			case 2:
				System.out.print("출금액> ");
				int money2=Integer.parseInt(scan.nextLine());
				
				if(money2<0) {
					System.out.println("잘못된 입력입니다");
				}else if(money2>balance) {
					System.out.println("잔액이 부족합니다.");
				}else {balance-=money2;
				}
				System.out.println("");
				break;
			case 3:
				System.out.println("잔액> "+balance);
				System.out.println("");
				break;
			default:
				run=false;
			}//switch
			
		}//while
		System.out.println("");
		System.out.println("시스템 종료");
		
		

	}//main

}//class
