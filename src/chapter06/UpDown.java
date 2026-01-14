package chapter06;

public class UpDown {
    //===== 필드값 (멤버변수, 인스턴스 변수) =====
	int answer=(int)(Math.random()*50)+1;
	int select;
	int count;  // int 같은 기본형 필드는 명시적으로 0 안 써도 자동으로 0으로 초기화됨
	//private String result = "FALSE"; - 강사님이 의도하신 check 사용법
    // -> 강사님이 의도한 패턴:
    //    - 기본값은 "FALSE" (아직 정답을 못 맞췄다).
    //    - 정답을 맞추면 "SUCCESS"로 바꾸고,
    //      updown 메서드에서 이 result를 return해서 main 쪽에서 성공 여부를 체크하도록 하는 구조.
	
	
	//===== 기본 생성자 =====
	public UpDown() {
		
	}
	

	//===== getter setter =====
	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}


	//updown 메서드
	public void updown(int select) {
		count++;
		
		if(select>answer) {
			System.out.println("DOWN!");
		}else if(select<answer) {
			System.out.println("UP!");
		}else {
			System.out.println((count)+"회만에 정답!!");
			// result = "SUCCESS";
            // -> 강사님이 의도한 방식:
            //    여기에서 result를 "SUCCESS"로 바꿔 놓고,
            //    메서드 리턴값으로 결과를 main에 알려주는 구조를 사용.
		}
        // return result;
        // -> 위처럼 result를 리턴하려면 메서드 선언을
        //    'public String updown(int select)'로 바꾸고,
        //    main에서는 updown(...)의 반환값을 String으로 받아서
        //    "SUCCESS"인지 여부에 따라 반복 종료 여부를 결정할 수 있음.
        //    (지금은 void라서 return이 불가능한 상태).
	}//updown
	
}//class
