package chapter03.whileTest;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 팩토리얼 알고리즘
		 * 5! -> 5x4x3x2x1 => n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		 */
		
		int number=5;
		int factorial=1; //factorial=factorial*number => factorial*=number
		
		// 숫자가 (number) 0이하가 아닐 때까지 반복하는 팩토리얼
		//#1
		while(true) {
			factorial*=number;
			number--;
			if (number == 0) {
				break;
			}
		}//while
		System.out.println("팩토리얼 결과 값: "+factorial);
		
		//#2
		/*while(number>0) {
			factorial*=number;
			number--;
			//factorial*=number--; <- 이렇게 줄일 수도 있음
		}
		System.out.println("팩토리얼 결과 값: "+factorial);*/
	}//m

}//c
