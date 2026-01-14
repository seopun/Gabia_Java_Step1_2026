package chapter03.whileTest;

public class WhileTest07 {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		//선수행을 하고 조건에 대입
		do {
			
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("1부터 10까지의 합: "+sum);
		
		
		
		

	}

}
