package chapter03.whileTest;

import java.util.Scanner;

public class WhileTest09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer=7;
		int input;
		
		do {
			
			System.out.print("1~10 사이 숫자 맞춰보세요: ");
			input=sc.nextInt();
			
			if(input>answer) {
				System.out.println("DOWN!");
			}else if(input<answer) {
				System.out.println("UP!");
			}
		}while(input !=answer);
		
		System.out.println("정답입니다!");

	}

}
