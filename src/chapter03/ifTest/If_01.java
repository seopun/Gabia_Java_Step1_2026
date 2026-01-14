package chapter03.ifTest;

public class If_01 {

	public static void main(String[] args) {
		// 삼항연산자
		// String str= age>=8 ? "학교에 다닙니다.":"학교를 다니지 않습니다.";

		// #1 if
		int age = 5;

		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		System.out.println("학교를 다니지 않습니다.");
		System.out.println("----------------------------");
		
		//#2 if
		int age2 = 10;
		
		if (age2 >= 8) {
			System.out.println("학교에 다닙니다.");
		}else { //그밖에
			System.out.println("학교를 다니지 않습니다.");
		}
		
		
		
		
		
		
		
		

	}

}
