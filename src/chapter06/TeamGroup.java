package chapter06;

public class TeamGroup { // 객체 배열

    // 기존에 배웠던 형태 예시:
    // TeamMember_05 member = new TeamMember_05();  // 객체 1개
    // int[] arr = new int[6];  // int 배열
	
    // 아래는 "객체 배열" = "객체 여러 개를 한꺼번에 관리하는 배열"
    // TeamMember_05 타입 객체를 담을 수 있는 칸 6개짜리 배열을 만든 것
	private TeamMember_05[] member = new TeamMember_05[6];
	

	
    // main이 없으므로 이 클래스만 단독 실행은 안 됨.
    // 다른 클래스의 main에서 new TeamGroup()으로 객체 만들어서 사용은 가능
	
    // 초기화용 메서드
	public void init() {
		
        // 객체 생성. for문도 가능하지만, 일단 하나씩 채워 넣는 방식으로 작성
        // new TeamMember_05("이름", "성별") -> 생성자에서 name, gender를 초기화
		member[0]=new TeamMember_05("장원준","남");
		member[1]=new TeamMember_05("부팀장","여");
		member[2]=new TeamMember_05("팀원1","남");
		member[3]=new TeamMember_05("팀원2","여");
		member[4]=new TeamMember_05("팀원3","남");
		member[5]=new TeamMember_05("팀원4","남");
	}//init
	
	
    // 출력용 메서드
	public void Disp() {
		
		for(int i=0;i<member.length;i++) {
			System.out.println("성명: "+(member[i].getName()));
			System.out.println("성명: "+(member[i].getGender()));
		}//for
	}//Disp

}
