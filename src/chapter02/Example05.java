package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*Scanner 을 사용하여 
		두 개의 불리언(boolean) 변수 isSunny와 isWarm을 입력받아, 
		날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
		(날씨가 화창하면서 따뜻한지에 대한 변수 isNiceWeather 으로 작성하세요.)*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("날씨가 화창한가요? (true/false): ");
		boolean isSunny = scan.nextBoolean();
				
		System.out.print("날씨가 따뜻한가요? (true/false): ");
		boolean isWarm = scan.nextBoolean();
		
		boolean isNiceWeather = isSunny && isWarm;
		System.out.println("날씨가 화창하면서 따뜻한가요? "+isNiceWeather);
		
		String isNiceDay = (isSunny && isWarm) ? "화창하면서 따뜻합니다.":"날씨가 좋지 않습니다.";
		System.out.println(isNiceDay);
		

	}

}
