package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest_04 {

	public static void main(String[] args) {

		String str[] = {"홍길동", "김유신", "장길산", "이순신"};
		String result = "";
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			result += str[i]+"\t";
		}//for
		System.out.println();
		System.out.println(result);
		
		JOptionPane.showMessageDialog(null, "[영웅들]\n" + result);
		
		
		
	}
}
