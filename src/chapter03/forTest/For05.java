package chapter03.forTest;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		System.out.print("0보다 크면서 11보다 작은 숫자를 입력하세요: ");
		int a=scan.nextInt();
		
		if ((a>0)&&(a<11)) {
			for(i=1;i<=a;i++) {
				System.out.println("메리-크리스마스");
			}//if 속 for
		} else {
			System.out.println("입력 값이 잘못되었습니다");
		}//if
		
		System.out.println("프로그램 종료");
		
		
		
	}//main

}//class
