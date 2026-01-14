package chapter02;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 나이(age)와 인원수(people)를 입력받으세요.
		 * 2. 기본 입장료는 1인당 20,000원입니다.(basePrice)
		 * 3. 나이에 따른 할인율을 적용하세요.
		 *    - 7세 미만: 무료 (0원)
		 *    - 13세 미만: 50% 할인(basePrice/2)
		 *    - 65세 이상: 30% 할인(basePrice*70)/100
		 *    - 그 외: 정상가 (basePrice)
		 * 4. 총 입장료를 계산하세요.(price*people)
		 * 5. 5명 이상(isGroupDiscount)이면 단체 할인 10%(totalPrice*90)/100를 추가로 적용하세요.
		 * 6. 삼항연산자를 활용하여 할인 적용 여부를 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = scan.nextInt();
		
		System.out.print("인원수 입력: ");
		int people= scan.nextInt();
		
		int basePrice = 20000;
		int price; // 1인당 가격
		
		// 나이별 할인 적용(중첩 삼항연산자)
		price = age <7 ? 0:
			    age <13? basePrice/2:
			    age >= 65 ? (basePrice*70)/100:
			    basePrice;
			    
		// 총 입장료
		int totalPrice=price*people;
		
		
		//단체 할인 여부
		boolean isGroupDiscount = people >=5;
		
		//단체 할인 적용
		int finalPrice = isGroupDiscount ? ((totalPrice*90)/100):totalPrice;
		
		//할인정보 확인
		String ageDiscount = age<7?"무료":
		age <13? "50% 할인":
		age >= 65 ? "30% 할인":
		    "정상가";
		
		String groupInfo = isGroupDiscount ? "(단체 할인 10% 추가 적용!)":"";
		
		System.out.println("==========================================");
        System.out.println("연령 할인: " + ageDiscount);
        System.out.println("1인 가격: " + price + "원");
        System.out.println("인원: " + people + "명");
        System.out.println("단체 할인 전: " + totalPrice + "원");
        System.out.println("최종 금액: " + finalPrice + "원 " + groupInfo);
        System.out.println("==========================================");
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		int basePrice = 20000;
		int price = (age<7) ? (basePrice*0):
		         	(age<13) ? (basePrice/2):
				    (age>=65) ? ((basePrice*70)/100):basePrice;
			        
			        
		
		System.out.println("입장료는 1인당 "+price+"(원)입니다.");
		
		
		System.out.print("인원수를 입력하세요: ");
		int people = scan.nextInt();
		int totalPrice = (people>=5)? ((people*price*90)/100):(people*price);
		
		
		
		System.out.println("총 입장료는 "+totalPrice+"(원)입니다.");
		
		String ageDiscount = price<basePrice ? "나이 할인되셨습니다":"할인이 안 되셨습니다";
		System.out.println(ageDiscount);
		*/		
		
		
		
		
		
		

	}

}
