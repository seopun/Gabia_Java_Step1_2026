package chapter03.forTest;

import java.util.Iterator;

public class For02 {

	public static void main(String[] args) {

		System.out.println("===1부터 100까지의 합을 출력===");
		
		int i; // 인덱스 변수
		int sum = 0;
		
		for (i=1;i<=100;i++) {
			System.out.print(i+" ");
			sum+=i;
		}//for
		System.out.println();
		System.out.println("1부터 100까지의 합: "+sum+"입니다");
		
		
		
		
		
		
		
	}

}
