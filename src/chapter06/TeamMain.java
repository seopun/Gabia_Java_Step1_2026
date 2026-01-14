package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		 // TeamGroup 객체 생성
		TeamGroup team = new TeamGroup();
		
		// 팀원 정보 초기화 (TeamGroup.init() 호출)
		team.init();
		
		// 초기화된 팀원 정보 출력
		team.Disp();
		
		System.out.println();
		
        // main에서의 삽입도 가능하지만, 설계상 비추천.
        // 이유: 데이터 관리가 여기저기 흩어지면 코드가 복잡해지고 유지보수가 어려워짐.
        // 보통은 TeamGroup 같은 관리 클래스 안에서만 팀원을 생성/관리하게 설계하는 편이 좋음.
		
		TeamMember_05 t = new TeamMember_05();  // 기본 생성자 사용
		
        // setter를 이용해 필드 값 설정
		t.setName("김재형");
		System.out.println("팀장이름: "+t.getName());
		t.setmPhone("010-1111-2222");
		System.out.println("전화번호: "+t.getmPhone());
		

	}//main

}//class
