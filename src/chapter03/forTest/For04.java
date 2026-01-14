package chapter03.forTest;

import java.util.Iterator;

public class For04 {

	public static void main(String[] args) {
		
		System.out.println("===0부터 100까지의 수중 홀수의 합을 출력");
		
		int num;
		int total = 0;//반드시 초기화를 시켜줘야 한다
		
		for(num=1;num<=100;num++) {
		
			if(num%2==0) {
				continue; //그냥 가세요(무시)
			}
			
			System.out.print(num+ " ");
			total+=num; // total = total+num
		}//for
		
		System.out.println();
		System.out.println("0부터 100까지의 수중 홀수의 합: " + total);

		System.out.println("--------------------------------------");
		
		int n;
		int sum = 0;
		for (n=1;n<=100;n+=2) {
			System.out.print(n+" ");
			sum+=n;
		}
		
		System.out.println();
		System.out.println("0부터 100까지의 수중 홀수의 합: " + sum);
		
		System.out.println("--------------------------------------");
		
		int n2;
		int hap=0;
		
		for(n2=1;n2<=100;n2++) {
			
			if (n2%2==1) {
				hap+=n2;
			}//if 
			
			System.out.print(n2+" ");
			
		}//for
	
	System.out.println();
	System.out.print("0부터 100까지의 수중 홀수의 합: " + hap);
		
		
		
		
	}//main

}//class
