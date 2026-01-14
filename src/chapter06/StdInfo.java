package chapter06;

public class StdInfo {

	//===== 멤버변수(필드) =====
	public String studentName;
	public int grade;
	public int money;
	
	
	//===== 생성자 =====
	//기본생성자 - 안 쓸 거면 안 꺼내도 되지만, 꺼내는 게 안전하다.
	public StdInfo() {
		
	}
	
	//생성자 오버로딩(studentName, money)
	public StdInfo(String studentName, int money) {
		this.studentName=studentName; // 매개변수 이름이랑 필드 이름 같으니까 this로 구분함
		this.money=money;
	}
	
	
	//===== 메서드 =====
	//버스
	public void takeBus(Bus bus) { // Bus 클래스를 매개변수로 받음 (객체 간 협력)
		bus.takebus(1400); //class 버스에 있는 takebus라는 메서드를 불러옴
		this.money -= 1400; // 학생의 지출
        // 여기서 this 없이 그냥 money -= 1400; 써도 동작은 같다.
        // 이유: 메서드 안에 같은 이름의 지역변수가 없기 때문.
        // 하지만 this를 붙이면 '객체 자신의 필드'라는 의미가 명확해져서 가독성이 좋아짐.
	}
	
	//지하철
	public void takeSubway(Subway subway) { //매개변수로 class를 집어넣을 수도 있다.(Subway가 퍼블릭이라 가능)
		subway.takesubway(1800);
		this.money -= 1800;
	}
	
	//잔액 출력
	public void showinfo() {
		System.out.println(studentName+ "님의 잔액은 "+money+"입니다.");
	}
	
}//class
