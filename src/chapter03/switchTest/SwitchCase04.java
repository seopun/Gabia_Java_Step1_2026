package chapter03.switchTest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("회원의 등급은 어떻게 되나요? ");
		// A, a -> 최우수고객
		// B, b -> 우수고객
		// 나머지 -> 일반고객
		
		//charAt(0): String -> 첫 번째 문자만 가져옴
		char grade=scan.nextLine().charAt(0);
		
		switch (grade) {
		case 'A' : case'a':
			System.out.println("최우수고객");
			break;
		case 'B' : case'b':
			System.out.println("우수고객");
			break;
		default:
			System.out.println("일반고객");
		}//switch
		
		
		
		

	}//main

}//class
