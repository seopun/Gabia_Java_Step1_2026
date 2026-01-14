package chapter03.ifTest;

import javax.swing.JOptionPane;

public class If_05 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2: "));
		
		if (num1>num2) {
			System.out.println("num1이 큽니다.");
		}else if (num1<num2) {
			System.out.println("num2가 큽니다.");
		}else if (num1==num2) {
			System.out.println("두 수는 같습니다.");
		}else {
			System.out.println("다시 입력해 주세요.");
		}//if
		
		
		

	}

}
