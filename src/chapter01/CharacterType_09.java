package chapter01;

public class CharacterType_09 {

	public static void main(String[] args) {
		// A:65, a:97 => ASCII 코드
		
		int a=65;
		System.out.println(a);
		System.out.println("사칙연산: " + (a+10));
		
		//명시적 형변환 => char: 정수가 문자로 변환
		System.out.println("--------------------");
		System.out.println((char)a);
		System.out.println((char)(a+1));
		
		System.out.println("--------------------");
		int b=66;
		System.out.println((char)b);
		System.out.println((char)(b+1));
		
		System.out.println("--------------------");
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		System.out.println((char)(a2+1));

	}

}
