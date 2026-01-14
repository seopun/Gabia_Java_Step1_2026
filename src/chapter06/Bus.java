package chapter06;

public class Bus {

    //===== 멤버변수(필드) =====
	int busNumber;
	int passengerCount;
	int money;
	
	
	//===== 생성자 =====
	// 기본 생성자
	public Bus() {
		
	}
	
	//생성자 오버로딩
	public Bus(int busNumber) {
		this.busNumber = busNumber; // 매개변수 이름이 멤버변수와 같으니까 this로 구분함
	}//Bus
	
	
	//===== 메서드 =====
    // 버스 탑승 메서드
	public void takebus(int money) { //승객이 낸 돈 (money는 매개변수)
		//this가 붙는 게 멤버변수. 변수방 이름을 다르게 하면 this 필요 없음
		this.money += money; // 누적 수입 증가. this.money는 Bus의 멤버변수 money
		passengerCount++; // 승객의 수 증가
		
	}
	
	// 버스 상태 출력 메서드
	public void showinfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
	
}//class
