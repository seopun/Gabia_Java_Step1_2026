package chapter06;

public class AccessTest_02 {

	// ===== 멤버 변수(필드) =====
    // 접근 제어자에 따라 "어디서까지 이 변수에 직접 접근할 수 있는지"가 달라진다
	private int aa; // private: 이 클래스 안에서만 직접 접근 가능 (가장 숨김 수준이 강함)
	public int bb; // public: 어디서든지 접근 가능 (다른 패키지, 다른 클래스에서도)
	int cc;   // 아무것도 안 쓰면 default(패키지 전용): 같은 패키지 안에서만 접근 가능
	

    // ===== 생성자 =====
    // 생성자를 따로 안 적으면 "매개변수 없는 기본 생성자"가 자동으로 만들어진다.
    // 그래서 new AccessTest_02()가 가능함.
	
	
    // ===== Setter 메서드들 =====
    // 외부에서 private 필드에 값을 넣고 싶을 때 이런 set 메서드를 통해 "간접 접근"한다.
    // 이런 패턴을 setter라고 부른다.(Source -> Generate Getters and Setters)
	
	public void setAa(int aa) {
        // 매개변수 aa와 멤버변수 aa 이름이 똑같아서 구분이 필요함.
        // this.aa → 이 객체의 멤버변수 aa
        // 오른쪽 aa → 메서드 매개변수 aa
        // this는 "현재 객체 자기 자신"을 가리키는 키워드이다.
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
    // ===== 출력용 메서드 =====
	public void Disp() {
        // 같은 클래스 안에서는 private든 뭐든 그냥 멤버변수 이름만 써도 접근 가능
		System.out.println("aa값: "+aa+" bb값: "+bb+" cc값: "+cc);
	}
	
	
	
    // ===== main 메서드(프로그램 시작점) =====
	public static void main(String[] args) {
		
		
        // 객체 생성: new로 메모리에 실제 객체를 만들고,
        // 그 주소를 obj라는 참조 변수에 담는다.
		AccessTest_02 obj=new AccessTest_02();
		
		obj.aa=10;; // 직접 대입 (같은 클래스 안이라 허용됨)
		// System.out.println(obj.aa);
		
        // 간접 대입: setter를 통해 값 변경
		obj.setAa(20);
		System.out.println("setAa(20) -> "+obj.aa);
		
		obj.setBb(30);
		System.out.println("setBb(30) -> "+obj.bb);
		
		obj.setCc(40);
		System.out.println("setCc(40) -> "+obj.cc);
		
        // 최종 상태 출력
		obj.Disp();

	}//main



}//class

/*
    “클래스 설계할 때, 이 객체가 가져야 할 정보/속성”
    → 멤버변수

    “이 메서드를 쓸 때, 밖에서 입력으로 받아야 하는 값”
    → 매개변수
*/
