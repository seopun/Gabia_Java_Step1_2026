package chapter06;

public class TeamMember_05 {

	
    // 필드 = 멤버변수
    // 한 팀원이 가지는 정보(속성)들
	
	public String teamName; // 팀명
	public String mName; // 팀장
	public String mPhone; // 팀장 전화번호
	public String sName; // 부팀장
	public String name; // 팀원명
	public String gender; //팀원 성별
	
    // ===== 생성자 =====
	
    // 생성자(디폴트 생성자)
    // 생성자를 하나라도 만들면, 컴파일러가 자동으로 기본 생성자를 만들어주지 않기 때문에
    // 이렇게 직접 써줘야 new TeamMember_05()가 가능해진다.
	public TeamMember_05() {
		// TODO Auto-generated constructor stub
	}
	
	
    // 생성자 Overload (오버로딩)
    // 같은 이름의 생성자지만, 매개변수 목록이 다름
    // 이름과 성별만 받는 생성자 -> 빠르게 팀원 객체 생성 가능
	public TeamMember_05(String name, String gender) {
        // this.name / this.gender : 멤버변수
        // 오른쪽 name / gender : 매개변수
		this.name=name;
		this.gender=gender;
	}


    // ===== getter / setter =====
    // 메서드를 통해 필드에 간접적으로 접근하게 해줌.
    // 보통 필드를 private으로 두고 getter/setter로만 접근시키는 패턴을 많이 씀.
    // 여기서는 필드가 public이라 직접 접근도 가능하지만, 연습 겸 같이 두는 예시라고 보면 됨.
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	

}// class
