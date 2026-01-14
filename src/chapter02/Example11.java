package chapter02;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 나이를 입력받으세요. (age)
		 * 2. 나이에 따라 관람 가능한 영화 등급을 판정하세요.
		 *    - 19세 이상: "청소년 관람불가 영화 가능"
		 *    - 15세 이상 19세 미만: "15세 이상 영화 가능"
		 *    - 15세 미만: "전체 관람가 영화만 가능"
		 * 3. 중첩 삼항연산자를 사용하세요.
		 * 4. 추가로 성인인지(19세 이상) 판별하는 boolean 변수를 만드세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력: ");
		
		int age=scan.nextInt();
		
		boolean isAdult = age>=19;
		
		String rating = age>=19 ? "청소년 관람불가 영화 가능":
			            age>=15 ? "전체 관람가 영화만 가능":
			            "전체 관람가 영화만 가능";
		System.out.println("등급: " +rating);
		
		System.out.println("성인 여부: " +(isAdult ? "성인":"미성년자"));
		
		/*
		String result=isAdult ? "성인" : "미성년자";
		System.out.println("성인 여부: " + result);
		*/
	    /*
		//관람 가능한 영화 등급
		String a = (age<0) ? "나이를 입력하세요":
				   (age<15) ? "전체 관람가 영화만 가능":
			       (age>=19) ? "청소년 관람불가 영화 가능":"15세 이상 영화 가능";
		System.out.println(a);
		
		//성인이신가요
		boolean adult = age>=19;
		String b = adult ? "성인이십니다":"성인이 아니십니다";
		System.out.println(b);
		*/		   
		
		
		
		
		
		
		
		
		
		
		
	}

}
