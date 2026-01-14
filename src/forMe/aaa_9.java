package forMe;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aaa_9 {

	public static void main(String[] args) {
		/*
		 * 1부터 30까지 출력하되, 3의 배수일 때는 숫자 대신 "짝"을 출력하세요.
		 * 
		 * 출력 예시: 1 2 짝 4 5 짝 7 8 짝 ...
		 */

		System.out.println("===1부터 30까지 출력. 단 3의 배수는 숫자 대신 짝===");

		int i; // 인덱스 변수

		for (i = 1; i <= 30; i++) {

			if (i % 3 == 0) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");

			} // if

		} // for
		System.out.println();
		System.out.println("------------------------------");
		
		/*
		 * 사용자의 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, 저체중/정상/과체중/비만을 판정하세요.
		 * BMI = 몸무게 / (키/100)²
		 * 18.5 미만:저체중, 18.5~23:정상, 23~25:과체중, 25 이상:비만
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력하시오: ");
		double cm = scan.nextDouble();

		System.out.print("몸무게를 입력하시오: ");
		double kg = scan.nextDouble();

		double BMI = kg/((cm/100)*(cm/100));
		String a = "";

		if (BMI >= 25) {
		    a = "비만";
		} else if(BMI >= 23 && BMI < 25) {
		    a = "과체중";
		} else if(BMI >= 18.5 && BMI < 23) {
		    a = "정상";
		} else {
		    a = "저체중";
		}

		System.out.println("당신은 "+ a +"입니다.");
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
