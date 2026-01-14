package chapter05;

import javax.swing.JOptionPane;

public class FuncTest_03 {
	// Display1과 Display2는 기능이 동일하지만:
	// 
	// static (Display1): 
	//   - 간단한 기능, 상태(인스턴스 변수) 불필요할 때
	//   - 예: Math.max(), Arrays.sort()
	// 
	// 인스턴스 (Display2):
	//   - 객체의 상태(인스턴스 변수)를 사용할 때
	//   - 예: String의 length(), ArrayList의 add()
	
	public static void Display1(String[] A) {
		String res = "";
		
		//A 배열변수방의 요소를 모두 res에 저장하는 method
		for(int i=0;i<A.length;i++) {
			res += A[i]+" ";
		}//for
		
		System.out.print(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n"+res);
	}//Display1
	
	public void Display2(String[] A) { //static이 없음
		String res = "";
		
		//A 배열변수방의 요소를 모두 res에 저장하는 method
		for(int i=0;i<A.length;i++) {
			res += A[i]+" ";
		}//for
		
		System.out.print(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n"+res);
	}//Display2
	
	public static void main(String[] args) { 

		
		String str[] = {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		//이미 할당되어 있고, 요소도 있으므로 String[] A = new String[]; 같은 초기화가 필요 없음.
		
		Display1(str);
	
		System.out.println();
		
		// Display2(str); - static이 없어졌으므로 객체 없이는 불러오기가 안 됨.
		FuncTest_03 obj=new FuncTest_03();
		obj.Display2(str);
		
		// System.out.println(str+"입니다"); - 같은 것도 안 됨.
		
	}//main

}//class

//===== JVM 메모리 구조 =====

// Method Area(Static Area => Metaspace)
// -> static 변수 또는 메서드
// -> 프로그램이 실행 시 클래스 로딩되면서 JVM에 적재됨
// -> 객체 생성 없이 사용이 가능

// Heap 영역(동적 메모리)
// -> new 키워드를 통해 생성됨(객체와 배열)
// -> 인스턴스 변수
// -> clase()로 소멸(생략이 가능)

// Stack 영역
// -> 지역변수, 메서드 호출, 매개변수
// -> 메서드 호출 시 Stack Frame으로 작성
// -> 메서드 종료 시 자동 제거 


//===== static vs 인스턴스 메서드 비교 =====
//static 메서드:
//- 호출: 클래스명.메서드명() 또는 직접 호출
//- 접근: static 멤버만 접근 가능
//- 용도: 유틸리티 메서드, 공통 기능

//인스턴스 메서드:
//- 호출: 객체.메서드명() (객체 생성 필수)
//- 접근: 모든 멤버(static, 인스턴스) 접근 가능
//- 용도: 객체의 상태를 다루는 기능



