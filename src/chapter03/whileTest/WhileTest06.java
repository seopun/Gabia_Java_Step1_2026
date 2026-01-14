package chapter03.whileTest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt = 0, sum=0;
		double avg;
		
		while (true) {
			System.out.print("숫자를 입력하세요(stop->0): ");
			num=scan.nextInt();
			if(num==0) {
				System.out.println("프로그램 종료");
				break;
				}
			
			cnt++; //cnt가 if문보다 위에 가면 0도 카운트 된다
			sum+=num;
			
			
		}//while
		
		avg=(double)sum/cnt;
		
		// 입력된 숫자의 개수, 총합, 평균
		System.out.print("입력된 숫자의 개수: "+cnt+"\n");
		System.out.print("입력된 숫자의 합계: "+sum+"\n");
		System.out.printf("입력된 숫자의 평균: %.3f",avg);



	}//main

}
