package chapter05;

import java.awt.Container;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		int cnt = 0;
		System.out.println("==== 이번주 로또 예상번호 ====");

		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "]: ");
			int[] lotto = new int[6];
			int index = 0; //첨자
			
			//로또 6개 출력
			while(index < 6){
				int num = (int)(Math.random() *45)+1;
				//중복체크
				if(!contains(lotto, num)) { //false가 되어야 하니까 !
					lotto[index++]=num; //중복이 안 되면(false) 담아주고, 안 되면 못 담음
				}//if
			}//in while
			
			Arrays.sort(lotto); //정렬해주는 메소드.(이미 만들어져 있음)
			
			for(int num:lotto) { // :를 해주면 알아서 들어옴
				System.out.print(num+" ");
			}
			
			System.out.println();
			cnt++;
		}//out while
		
		
	}//main
	
	//--------------------------------------------------------------
	
	//중복 검수
	public static boolean contains(int[] arr, int num) {
		
		for(int i:arr) {
			if(i == num) { //num은 배열방에 있는 것. 방금 받은 숫자는 i
				return true; //중복 발견
			} //if
		}//for. 현재 뽑은 걸 i에 담는다.
		
		return false; //중복숫자 없음.
		//여기서 true false가 반대가 되어도 상관없음
		//반대가 되면 if문에서 !를 지우면 됨.
	}
	
	
	
	
	
	
	
	
	
	
	
	

}//class
