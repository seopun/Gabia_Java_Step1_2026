package chapter04;

public class ArgsTest_02 {

	public static void main(String[] args) {
		// 배열의 선언
		int a[] = new int[5];
		
		int[] b; //fixed length
				//int를 몇 개 선언할지 모르는 상태에서는 이런 식으로 쓴다.
				//int c; c=50과 똑같음
		
		b=new int[5];
		
		args=new String[2];
		args[0]="10";
		args[1]="20";
		
		int aVal;
		int bVal;
		
		String sum = args[0]+args[1]; //문자로 인식하므로 10+20=1020이 된다
		System.out.println("문자열의 병합: "+sum);
		
		if(args.length==2) {
			aVal=Integer.parseInt(args[0]); //10
			bVal=Integer.parseInt(args[1]); //20
		} else {
			aVal =0;
			bVal=0;
		}
		
		System.out.println("---------------");
		int Total=aVal+bVal;
		System.out.println("산술연산: "+Total);
		
		

	}

}
