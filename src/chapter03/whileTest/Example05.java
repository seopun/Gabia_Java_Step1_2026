package chapter03.whileTest;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		
		boolean run=true; //switch, 제어 플래그 패턴
		int save=0; // 예금(+), 출금(-)
		int money;
		int num;

		Scanner scan=new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			num=scan.nextInt();
			
			if (num==1) {
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 금액: "+save);
				System.out.print("입금할 금액을 입력하세요: ");
				money = scan.nextInt();//5000
				if(money<=0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				}else {
					save+=money;
				}
			} else if (num==2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 금액: "+save);
				System.out.print("출금할 금액을 입력하세요: ");
				money = scan.nextInt();//7000
				save-=money; //-2000
				if(save < 0) {
					System.out.println("잔액이 부족합니다.");
					save+=money; //-2000+7000=5000
				}
			} else if(num==3) {
				System.out.println("잔액을 선택하셨습니다.");
				System.out.println("현재 금액: "+save);
			} else if(num==4){
				System.out.println("종료를 선택하셨습니다.");
				run=false;
			} else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다.");
			}//if
			
		}//while
		System.out.println("");
		System.out.println("시스템 종료");		

	}

}
