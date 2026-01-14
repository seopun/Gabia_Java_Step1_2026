package chapter01;

public class DoubleType_06 {

	public static void main(String[] args) {
		
		//정수와 실수중 크기가 같다면 정밀한 타입으로 자동 형변환
		int aVal=10;
		float bVal=10.5f;
		
		//int result1=aVal+bVal; //ERROR
		float result2=aVal+bVal;
		
		System.out.println("aVal+bVal: "+ result2);
		System.out.println("aVal+bVal: "+ (aVal+bVal));
		
	}

}
