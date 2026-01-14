package chapter04;

public class ArgsTest_01 {

	public static void main(String[] args) {
		// 배열(Array)
		
		// int numbers[]=new int[5]; 대괄호를 int 뒤에 붙이든 numers 뒤에 붙이든 
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		// numbers[5]=60; 같은 걸 만드는 순간 에러가 난다
		
		int len = numbers.length;
		System.out.println("numbers의 개수: "+len);
		System.out.println();
		
		//for(int i=0;i<numbers.length;i++)for(int i=0;i<5;i++)
		for(int i=0;i<len;i++) {
			System.out.println(i+"번 첨자의 요소: "+numbers[i]);
		}
		
		
		

	}

}
