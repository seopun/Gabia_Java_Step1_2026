package chapter03.switchTest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요. 
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("뭐 먹을까요? ");
		String str;
		str = scan.nextLine(); // 요일 입력

		switch (str) {
		case "월요일":
			System.out.println("쌀밥");
			break;
		case "화요일":
			System.out.println("보리밥");
			break;
		case "수요일":
			System.out.println("잡곡밥");
			break;
		case "목요일":
			System.out.println("현미밥");
			break;
		case "금요일":
			System.out.println("전복밥");
			break;
		case "토요일":
			System.out.println("송이밥");
			break;
		case "일요일":
			System.out.println("녹차밥");
			break;
		default:
			System.out.println("잘 못 입력 하셨습니다.");

		}// switch
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("요일을 입력하세요: ");
		String day=scan.nextLine();
		String Food="";
	
		
		switch (day) {
		case "월요일": case "월":
			Food = "떡볶이";
			break;
		case "화요일": case "화":
			Food = "스파게티";
			break;
		case "수요일": case "수":
			Food = "피자";
			break;
		case "목요일": case "목":
			Food = "치킨";
			break;
		case "금요일": case "금":
			Food = "메밀국수";
			break;
		case "토요일": case "토":
			Food = "라면";
			break;
		case "일요일": case "일":
			Food = "초밥";
			break;
		default: 
			Food = "굶어야겠다";
		}	
		System.out.println(day+"요일은(는) "+Food+" 먹는 날~");*/
		

	}

}
