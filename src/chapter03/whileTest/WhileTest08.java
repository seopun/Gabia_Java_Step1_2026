package chapter03.whileTest;

import javax.swing.JOptionPane;

public class WhileTest08 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		do {
			
			num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if(num1==num2) {
				System.out.println("인증성공!");
			}else {
				break;
			}
			
		}while(num1!=num2);
		
		System.out.println("프로그램 종료");
		
		
		
		

	}//m

}//c
