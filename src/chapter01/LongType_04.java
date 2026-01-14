package chapter01;

public class LongType_04 {

	public static void main(String[] args) {
		// Long Type
		//int num1=12345678900; //int 4byte =4*8=>32bit
		long num2=12345678900L;
		long num3=1000; //long형이지만 L또는 l 표시가 없으면 자동으로 int형으로 변환
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num2+num3);
		
		//-------------------------------
		int level; //선언만 하고 초기화 하지 않음
		level=10; //리터널 값
		
		System.out.println(level);

	}

}
