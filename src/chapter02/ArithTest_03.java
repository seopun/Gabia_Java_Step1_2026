package chapter02;

public class ArithTest_03 {

	public static void main(String[] args) {

		// 대입연산(assignment)
		int num1 = 10; // 10 리터럴(Literal)
		int num2 = 20;

		System.out.println(num1);

		num1 = num1 + num2;
		System.out.println(num1);

		// 축약형(복합연산)
		num1 += num2; // num1 = num1 + num2;
		System.out.println(num1);

	}

}
