package chapter03.whileTest;

public class WhileTest03 {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		while (num<=100) {
			System.out.print(num);
			System.out.println();
			
			sum+=num; //sum=sum+num
			num++;
			System.out.print((num-1)+" ");
			
		}
		
		System.out.println();
		System.out.print("1부터 100까지의 합: "+sum);
		
		

	}

}
