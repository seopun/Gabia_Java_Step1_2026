package chapter04;

public class ArrayTest_05 {

	public static void main(String[] args) {
		
		char[] alpa = new char[26];
		char ch = 'A'; //65
		
		/*for (int i=0; i<alpa.length; i++) {
			alpa[0]=ch;
			ch++;
			System.out.print(alpa[0]+ " ");
			
		}//for*/
		for (int i=0; i<alpa.length; i++,ch++) {
			alpa[0]=ch;
			System.out.print(alpa[0]+ " ");
			
		}//for

		
		
		
	}//main

}//class
