package chapter03.ifTest;

import javax.swing.JOptionPane;

public class If_06 {

	public static void main(String[] args) {

		// 데이터셋
		String ID = "soldesk";
		int PW = 251216;
		
		//고객
		String id=JOptionPane.showInputDialog("아이디");
		
		if (ID.equals(id)) {

			//비밀번호
			int pass=Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
			if (PW==pass) {
				System.out.println(ID+"님 환영합니다.");
			}else{
				System.err.println("비밀번호가 일치하지 않습니다.");
			}//in if
			
		}else {
			System.out.println("일치하는 아이디가 없습니다.");
		}//out if
		
		
		
	}//main

}//class
