package chapter06;

import java.util.Scanner;

public class UpDownMain_10 {

	public static void main(String[] args) {
		
		//===== 지역변수 =====
		int select;      // 사용자가 입력하는 숫자
		String check;    // 게임을 계속할지 여부를 담는 플래그 (y/n) - 강사님이 의도하신 방식과는 다름
		Scanner scan = new Scanner(System.in);

		// UpDown 게임 객체 생성 (answer, count는 객체 내부에서 관리)
		UpDown updown = new UpDown();
		
		check= "n";
		
		// check가 "n"인 동안(계속 하겠다는 동안) 반복
		while(check.equals("n")) {
		System.out.print("숫자를 입력하세요(1~50):");
		select = Integer.parseInt(scan.nextLine());
		
		// 1) setter를 사용하는 방식 (객체지향 스타일)
        updown.setSelect(select);
        // 2) 같은 패키지라면 이렇게 직접 대입도 가능함 (지금은 int select가 default 접근)
        // updown.select = select;  // 이 코드도 문법적으로는 가능함.
		
        
		// 업다운 로직 실행 (시도 횟수 증가 + UP/DOWN/정답 출력)
		updown.updown(select);
			
		//종료 코드
		if(select==updown.getAnswer()) {
			System.out.println("종료하시겠습니까?(y/n)");
			check = scan.nextLine();
			if(check.equals("y")) {
			break;
			} else {
					updown.count = 0;
			}//if 속 if
		}//if
		}//while
		
		
		/* 강사님 의도ver.
        while (true) { // 무한루프 시작
            System.out.print("숫자를 입력하세요(1~50): ");
            int select = Integer.parseInt(scan.nextLine());

            updown.updown(select);

            // result가 SUCCESS가 되면 break로 탈출
            if (updown.getResult().equals("SUCCESS")) { // 상태 플래그 확인
                break; // while(true) 탈출
            }
        }
		*/
		
		
		scan.close();
	}//main끝

}//class
