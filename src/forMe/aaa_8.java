package forMe;

import java.util.Scanner;

public class aaa_8 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 키(height)를 입력받으세요. (단위: cm, double 사용)
		 * 2. Scanner를 이용하여 몸무게(weight)를 입력받으세요. (단위: kg, double 사용)
		 * 3. BMI를 계산하세요: bmi = weight / ((height / 100) * (height / 100))
		 *    (키를 미터로 바꾸려면 100으로 나눠야 합니다)
		 * 4. BMI가 25.0 이상인지 판별하는 boolean 변수(isOverweight)를 만드세요.
		 * 5. BMI가 18.5 미만인지 판별하는 boolean 변수(isUnderweight)를 만드세요.
		 * 6. 중첩 삼항연산자를 사용하여:
		 *    - isOverweight이 true면 "과체중"
		 *    - isUnderweight이 true면 "저체중"
		 *    - 둘 다 아니면 "정상"
		 * 7. 최종적으로 "당신의 BMI: O.O (상태: 정상)" 형식으로 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("키(cm)를 입력하세요: ");
		double height = scan.nextDouble();
		
		System.out.print("몸무게(kg)를 입력하세요: ");
		double weight = scan.nextDouble();
		
		double bmi = weight / ((height / 100) * (height / 100));
		
		boolean isOverweight =(bmi>25.0);
		boolean isUnderweight =(bmi<18.5);
		String a  = isOverweight ? "과체중":
			        isUnderweight? "저체중":"정상";
		
		System.out.println("당신의 BMI: "+String.format("%.1f",bmi)+"(상태: " + a +")");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
