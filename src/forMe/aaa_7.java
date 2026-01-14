package forMe;

import java.util.Scanner;

public class aaa_7 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 현재 체중(weight)을 입력받으세요. (단위: kg, double 사용)
		 * 2. 하루 권장 단백질 섭취량은 체중 × 2.0g 입니다. (dailyProtein)
		 * 3. 보충제 1스쿱당 단백질 함량(proteinPerScoop)을 입력받으세요. (예: 25.5g, double 사용)
		 * 4. 하루에 몇 스쿱을 먹어야 하는지 계산하세요. (scoops = dailyProtein / proteinPerScoop)
		 * 5. 스쿱 수가 3.0 이상인지 판별하는 boolean 변수(isTooMuch)를 만드세요.
		 * 6. 삼항연산자로 "과다 섭취 주의!" 또는 "적정량입니다"를 출력하세요.
		 * 7. 최종적으로 "하루 필요 스쿱: O.O회"를 출력하세요. (소수점 첫째자리까지)
		 */
		
		Scanner scan = new Scanner(System.in);
		//현재 체중
		System.out.print("현재 체중(kg)을 입력하시오: ");
		double weight = scan.nextDouble();
		
		//하루 권장 단백질 섭취량
		double dailyProtein = weight*2.0;
		
		//보충제 1스쿱당 담백질 함량
		System.out.print("보충제 1스쿱당 단백질 함량을 입력하시오: ");
		double proteinPerScoop = scan.nextDouble();
		
		//하루에 몇 스쿱을 먹어야 하는가
		double scoops = dailyProtein / proteinPerScoop;
		
		boolean isTooMuch = scoops>=3.0;
		String a = isTooMuch ? "과다 섭취 주의!":"적정량입니다";
		System.out.println(a);
		System.out.println("하루 필요 스쿱: "+String.format("%.1f", scoops)+"회");
		
		
		
		
		
		
	}

}
