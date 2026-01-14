package chapter02;

import java.util.Scanner;

public class BitTest_14 {

	public static void main(String[] args) {
		// 키보드 입력값 받기
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력: "); //5 0101
		int num1=scan.nextInt();
		
		System.out.print("두 번째 숫자 입력: "); //10 1010
		int num2=scan.nextInt();
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResult=num1 & num2;
		int orResult=num1 | num2;
		int xorResult=num1 ^ num2;
		
		System.out.println("비트 AND 결과: "+ andResult);
		System.out.println("비트 OR 결과: "+ orResult);
		System.out.println("비트 XOR 결과: "+ xorResult);
		

	}

}
