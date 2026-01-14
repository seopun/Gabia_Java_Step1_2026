package chapter05;

import javax.swing.JOptionPane;

public class FuncTest_01 {
	
	//메서드
	//int num1, num2 => 매개변수(parameter): 메서드 선언부에서 정의하는 변수
	public static void sum(int num1, int num2) {
		// void: 반환값이 없는 메서드 (return 문 없음)
		// static: 객체 생성 없이 클래스명.메서드명() 또는 같은 클래스 내에서 바로 호출 가능
		int sum=num1+num2;
		System.out.println("두 수의 합: "+sum);
		
	} // pub 입력 후 ctrl+space로 자동완성. name은 임의로 변경 가능

	
	//--------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		int a, b;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		/*
		int sum=a+b;
		System.out.println("두 수의 합: "+sum);
		*/
		
		sum(a,b); //이태릭체는 static의 특징
		//a, b는 인자(argument): 메서드 호출 시 전달하는 실제 값
		//sum(a); sum(b);처럼 괄호 안의 숫자 개수가 맞지 않으면 실행 x
		//매개변수 타입과 전달하는 인자 타입이 일치해야 함

	}

}
//스택(Stack) 메모리: 메서드 호출, 지역변수 (예: int a, int sum)
//힙(Heap) 메모리: 객체, 배열 (예: new int[5], new String())
//지역변수(Local Variable): 메서드나 생성자 내부({} 블록 내부)에서 선언된 변수. 
//지역변수의 스코프(유효범위): 선언된 {} 블록 내부에서만 접근 가능
