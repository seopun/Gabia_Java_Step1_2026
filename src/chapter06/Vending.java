package chapter06;

public class Vending {
	
    // ===== 멤버변수(필드) =====
    // - 자판기가 가지는 상태값들
	private Can[] can = new Can[5]; // Can 객체 5개를 담을 수 있는 배열 (각 칸은 아직 null 상태)
	private int money;              // 사용자가 넣은 돈 (showCans/outCan에서 사용)
	
	
    // ===== 생성자 =====
    // 기본 생성자를 따로 안 써도 되지만,
    // 필요하면 여기서 init()을 호출해서 바로 음료 세팅해도 됨.


	//===== 메서드 =====
	
	// 자판기에 들어갈 음료들을 초기화하는 메서드
	public void init() {
		// 각 인덱스마다 새로운 Can 객체를 생성해서 넣어줌
		can[0] = new Can("환타", 1000);
		can[1] = new Can("사이다", 1200);
		can[2] = new Can("오렌지쥬스", 1100);
		can[3] = new Can("바나나우유", 1400);
		can[4] = new Can("콜라", 1000);
	}//init
	
	// 사용 가능한 음료만 출력하는 메서드
	public void showCans (int m) { // m은 사용자가 넣은 돈 (money의 약자)
		money = m; // 멤버변수 money에 저장해 둠. 매개변수 이름이 m이라 this.money 안 써도 됨.
		
		for(int i=0;i<can.length;i++) {
            // 만약에 내가 갖고 있는 돈보다 음료의 가격이 작거나 같으면 음료의 이름과 금액 출력
            // 여기서 money 대신 m을 써도 결과는 같음.
			// - money에는 이미 m값을 넣어놨기 때문.
			if (money>=can[i].getPrice()) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"원");
			} 
		}//for끝
	}//showCans
	
	//선택한 음료만 출력하는 메서드
	public void outCan(String name) {
        // name : 사용자가 선택한 음료 이름 (예: "바나나우유")
		
		for(int i=0;i<can.length;i++) { 
			//for(Can c:can){...} 이런 향상된 for문으로도 가능
			
            // String은 ==가 아니라 equals로 비교해야 함
			if(name.equals(can[i].getCanName())) { 
				if (money<can[i].getPrice()) {
					System.out.println("잔액이 부족합니다.");
					return;
				} else {
					System.out.println("선택하신 " + can[i].getCanName() + "를(을) 출력합니다.");
					System.out.println("잔액 " + (money - can[i].getPrice()) + "원 입니다.");
					return;
				}
				
			}//for 속 if끝
			
		}//for끝
		System.out.println("선택하신 "+name+"가 없습니다.");
	}//outCan
	
	
	

}//class
