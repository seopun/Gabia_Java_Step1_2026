package chapter03.forTest;

public class For06 {

	public static void main(String[] args) {
		// 1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요
		
		//#1
		int sum=0;
		for(int i=1; i<=100/3;i++) { //100/3=33
			System.out.print((3*i)+" ");
			sum+=3*i;
		}
		
		System.out.println();
		System.out.println("3의 배수의 합: " +sum);
		
		System.out.println("--------------------------");
		
		//#2
		int sum2 =0;
		for (int i=1;i<=100;i++) {
			if (i%3==0) {
				System.out.print(i+" ");
				sum2 += i;
			}
		}
		
		System.out.println();
		System.out.println("3의 배수의 합: " +sum2);
		
		
		
		/*
		int n;
		int total = 0;
		
		for(n=1;n<=100;n++) {
			
			if((n%3==1)||(n%3==2)) {
				continue;
			}//if
			
			System.out.print(n+ " ");
			total+=n;
		}//for

		System.out.println();
		System.out.println("1부터 100까지의 3의 배수의 합: " + total);
		*/
		
	}//main

}//class
