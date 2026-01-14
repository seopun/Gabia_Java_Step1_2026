package chapter06;

public class TakeTrans_08 {

	public static void main(String[] args) {

		// 학생 2명 생성(studentJames, studentTom)
		StdInfo studentJames = new StdInfo("James", 20000);
		StdInfo studentTom = new StdInfo("Tom", 23000);

		// ① studentJames가 버스 타기 (100번 버스)
		// -> Bus 객체를 먼저 생성해야 takeBus() 메서드 호출 가능
		Bus bus100 = new Bus(); // Bus 클래스의 인스턴스 생성
		studentJames.takeBus(bus100); // studentJames라는 객체가 takebus라는 메소드 실행

		// 학생잔액 확인
		studentJames.showinfo();

		// 버스 수입
		// → 아래처럼 나중에 번호 지정 가능하지만,
		// Bus 생성 시 () 안에 busNumber를 파라미터로 넘기면 생성자에서 바로 설정 가능함.
		bus100.busNumber = 100;
		bus100.showinfo();

		System.out.println("-----------------------------------");

		// ② studentTom이 bus999번 버스 타기
		Bus bus999 = new Bus(999);
		studentTom.takeBus(bus999);
		// 학생잔액 확인
		studentTom.showinfo();

		// 버스 수입
		bus999.showinfo();

		System.out.println("-----------------------------------");

		// ③ studentJames가 2호선 타기
		Subway subwayGreen = new Subway("2호선");
		studentJames.takeSubway(subwayGreen);

		// 정보확인
		studentJames.showinfo();
		subwayGreen.showinfo();

		// 임의의 승객 추가
		studentTom.takeSubway(subwayGreen);
		studentJames.takeSubway(subwayGreen);
		subwayGreen.showinfo();

		System.out.println("-----------------------------------");

		// studentTom이 3호선 타기
		Subway subwayOrange = new Subway("3호선");
		studentTom.takeSubway(subwayOrange);

		studentTom.showinfo();

		subwayOrange.showinfo();

	}// main

}// class

//✅ 용어 정리 (헷갈리기 좋은 것들 정리해둔 주석임)

//1) 멤버변수 = 필드 = 인스턴스 변수
//- 클래스 안에 선언된 변수 중에서, 객체(인스턴스)가 각각 따로 가지고 있는 변수.
//- 예) Bus 클래스 안의 busNumber, passengerCount, money 같은 것들.
//- 그래서 아래 세 표현은 거의 같은 걸 가리킨다고 보면 됨.
//* 멤버변수
//* 필드(field)
//* 인스턴스 변수(instance variable)

//2) 인스턴스 = 객체
//- 'new' 키워드를 사용해서 클래스로부터 실제로 만들어진 실체를 말함.
//예) Bus bus100 = new Bus(100);
//    여기서 new Bus(100); 으로 만들어진 것이 Bus 클래스의 '객체'이자 '인스턴스'.
//- 그래서 보통 'Bus 객체', 'Bus 인스턴스'라고 부르는 건 거의 같은 말.

//3) 참조 변수(레퍼런스 변수)
//- 만들어진 객체(인스턴스)를 가리키는 변수 이름.
//예) Bus bus100 = new Bus(100);
//    여기서 'bus100'이 참조 변수임.
//- 흔히 "객체 이름"이라고 부르는 게 사실은 이 참조 변수 이름을 말하는 경우가 많음.

//4) 객체 이름(변수 이름)은 문자로 시작해야 함
//- 자바에서 변수/객체 이름은 '식별자' 규칙을 따라야 함.
//* 숫자로만 된 이름은 안 됨. → 100, 999 이런 건 '이름'이 아니라 그냥 숫자 값(int 리터럴).
//* 첫 글자는 문자(A~Z, a~z), 언더스코어(_), 달러기호($)만 가능.
//* 그 뒤부터는 숫자를 섞어 쓸 수 있음.
//  예) bus100, bus999, _100 등은 가능하지만,
//      100, 999 처럼 숫자만 단독으로 이름으로는 불가능.
//- 그래서 '객체는 문법 규칙 때문에 문자 형태(식별자 규칙 지킨 이름)로만 이름을 지을 수 있다'라고 이해하면 됨.
//실제 값이 숫자(버스 번호 100, 999 등)인 건 필드(int busNumber)에 저장하는 거고,
//그걸 가리키는 변수 이름은 bus100, bus999 같은 식으로 문자+숫자 조합으로 지어야 함.

//5) 클래스 vs 객체 vs 인스턴스 정리
//- 클래스(Class): 설계도.
//예) Bus, StdInfo 같은 타입 정의.
//- 객체(Object): 설계도로 만들어낸 실제 물건.
//예) new Bus(100) 으로 생성된 것 하나하나가 객체.
//- 인스턴스(Instance): '특정 클래스의 객체'라는 의미를 강조할 때 쓰는 말.
//예) Bus 클래스의 인스턴스 = Bus 객체.
//- 참조 변수: 그 인스턴스를 가리키는 이름.
//예) Bus bus100 = new Bus(100); 에서 bus100이 참조 변수.
