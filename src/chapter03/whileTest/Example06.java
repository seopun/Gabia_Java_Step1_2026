package chapter03.whileTest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		int cnt, num, i;
		boolean run = true;
		String str = ""; 
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			
			num=Integer.parseInt(scan.nextLine()); //1. 2. 3
			if (num<1||num>3) {
				System.out.println("잘못된 접근입니다. 메뉴 화면으로 돌아갑니다.");
				continue;
			}
			switch (num) {
			case 1: {
				System.out.print("빵 개수 입력 : " );
				cnt = Integer.parseInt(scan.nextLine());
				for (i=0;i<cnt;i++) {
					System.out.print("빵"+i+"개");
					System.out.println("");
				}//for
				System.out.println("빵"+cnt+"개가 완성 되었습니다.");
				break;
			}case 2:{
				System.out.print("빵 개수 입력 : " );
				cnt = Integer.parseInt(scan.nextLine());
				System.out.print("종류 선택 : ");
				String name = scan.nextLine();
				for (i=1;i<=cnt;i++) {
					System.out.print(name+"빵"+i+"개");
					System.out.println("");
				}//for
				System.out.println("요청하신 "+cnt+"개의 "+name+"빵이 완성 되었습니다.");
				break;
			}
			default:
				System.out.println("종료를 선택하셨습니다.");
				run=false;
				break;
			}//switch
			
		}//while
		System.out.println("시스템 종료");
	}//main

}//class
