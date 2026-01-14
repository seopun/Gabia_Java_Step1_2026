package chapter04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 사용자에게 찾고 싶은 숫자를 1에서부터 10까지 입력 받아,
		// 해당 숫자의 인덱스를 찾아 출력하는 프로그램을 만드세요.
		// 단, 사용자가 입력한 값이 배열 인덱스로 나타낼 수 없는 경우 찾을 수 없다는 문구를 출력하세요.

		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6 };
		int target; // 알고싶은 숫자
		
		int index = -10;
		// 플래그 변수: -10은 "아직 못 찾음" 상태를 의미.
		// 실제 인덱스는 1~10이므로 -10은 불가능한 값. 굳이 -10일 필요는 없음.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고 싶은 숫자를 1에서 10사이로 입력하세요: ");
		target = scan.nextInt();
		

		for (int i = 0; i < numbers.length; i++) {
			if (target==numbers[i]) {
				index=(i+1);  // // 찾으면 위치 저장. +1은 인덱스를 사용자 친화적으로 변경
				break;
			} //if
		}//for
		
		if (index !=-10) { //index 값이 변했음 -> * 찾음 * 
			System.out.println(index+"번째에서 "+target+"를(을) 찾음");
		} else { //(index==-10) -> * 못 찾음 * 
			System.out.println("데이터베이스에 존재하지 않는 숫자입니다.");
		}
				
			/* 내가 짠 코드. 근데 index 변수를 아예 안 사용하게 되더라
			if((target>10)||(target<1)) {
				System.out.println(target+"를(을) 찾지 못했습니다");
			}//if

			if (target==numbers[i]) {
				System.out.println((i+1)+"번째에서 "+target+"를(을) 찾았습니다.");
				break;
			} //if
			*/
		

	}

}
