package forMe;

import java.util.Scanner;

public class aaa_3 {

	public static void main(String[] args) {
//		편의점에서 프로틴 음료가 '2+1' 행사 중입니다.
//	    Scanner로 구매하려는 음료 개수(count)를 입력받으세요. (예: 7개)
//	    이 중 **무료로 받는 개수(free)**를 계산하세요. (/ 3 하면 되겠죠?)
//	    실제로 **돈을 내야 하는 개수(paid)**를 계산하세요. (전체 개수 - 무료 개수)
//	    출력 형식:
//	text
//	총 7개를 가져가시면...
//	무료 증정: 2개
//	결제할 개수: 5개
//	(심화) 만약 음료 1개 가격이 2500원이라면, 총 결제 금액은 얼마일까요? 이것도 같이 출력해보세요.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매하려는 음료 개수: ");
		int count = scan.nextInt();
		
		int free=count/3;
		int paid=count-free;
				
		System.out.println("총 "+count+"개를 가져가시면...");
		System.out.println("무료 증정: "+free+"개");
		System.out.println("결제할 개수: "+paid+"개");
		System.out.println("총 결제 금액: "+(paid*2500)+"원");
		
		

	}

}
