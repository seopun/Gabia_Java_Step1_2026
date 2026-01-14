package chapter01;

public class BinaryTest_02 {

	public static void main(String[] args) {
		
		// 변수선언 타입
		/*
		 - 카멜: 첫자는 무조건 소문자 단 중간단어의 시작을 대문자 (bNum)
		 - 파스칼: 첫자만 무조건 대문자 나머지는 모두 소문자	(Bnum)  
		 */
	 
		//integer의 약자 int는 정수를 기억하는 변수방으로 선언
		int num=10; //십진수 (1~9)
		int bNum=0B1000; //이진수(Binary) (0~1)
		int oNum=010; //팔진수(octal -> OCT)
		
		System.out.println("10진수: " + num);
		System.out.println("8진수: " + oNum);
		System.out.println("2진수: " + bNum);
		System.out.println("--------------------------");
		
		int bNum2=0B10000; //2진수의 16
		int hNum=0x10; //16진수(0x)의 16
		
		System.out.println("2진수: " + bNum2);
		System.out.println("16진수: " + hNum);
		
	}

}
