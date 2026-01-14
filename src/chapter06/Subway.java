package chapter06;

public class Subway {

	//멤버변수
	public String lineNumber;
	int passengerCount;
	int money;
	
	public Subway() {
		
	}
	
	
	//생성자 오버로딩
	public Subway(String lineNumber) { //멤버변수 lineNumber가 String이므로 매개변수도 String
		this.lineNumber = lineNumber;
	}//Bus
	
	//메서드
	public void takesubway(int money) { //승객이 낸 돈 (money는 매개변수)
		this.money += money; // 지하철 수입
		passengerCount++; // 승객의 수 증가
		
	}
	
	public void showinfo() {
		System.out.println("지하철 "+lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
	
}//class
