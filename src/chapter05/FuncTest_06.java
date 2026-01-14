package chapter05;

import java.util.Scanner;

public class FuncTest_06 {
	
    // 반환 타입: String (교육 단계를 문자열로 반환)
	//반환값이랑 매개변수가 일치해야 할 필요는 없음.
	public static String EduStep(int edu) { // edu: 가매개변수(parameter, 형식 매개변수)
		
		String step= "";
		
		switch (edu) {
		case 1: 
			step="초급";
			break;
		case 2:
			step="중급";
			break;
		case 3:
			step="고급";
			break;
		case 4:
			step="특급";
			break;
		default:
			step="0";
			System.out.println("잘못 입력하셨습니다.");
		}//switch
		
		//-----------------------------------------
		return step; // step 값을 호출한 곳으로 반환
		
	}//EduStep(메서드 이름은 꼭 대문자로 시작해야 할 필요는 없음)
	
	
	public static void main(String[] args) {
		
		// 매개변수를 Scanner로 입력 받아서 사용 number
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요(1~4): ");
		int number = scan.nextInt();
		
		
        // EduStep의 반환값(리터럴 값)을 step 변수에 할당(어사인먼트)
        // number: 실매개변수(argument, 실인자) - 호출 시 전달하는 실제 값
		String step=EduStep(number);
		System.out.println("현재 수업 단계는 "+step+" 단계입니다");
		// 반환값을 변수에 저장 후 다른 문자열과 결합 가능
		// void였다면 반환값이 없어서 이런 식으로 문자열 조합 불가
		
	}//main

}//class

//Parameter (가매개변수): 메서드 정의의 변수 → edu
//Argument (실매개변수): 메서드 호출의 값 → number


