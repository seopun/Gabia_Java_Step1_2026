package forMe;

import java.util.Scanner;

public class aaa_16 {

	public static void main(String[] args) {
		/*
		 * 출석 관리 프로그램
		 * 
		 * 총 수강 인원 수를 먼저 입력받는다. (예: 30명) 메뉴: 출석 체크 (1명 추가) 결석 처리 (1명 감소) 현재 출석 인원 보기 종료
		 * 
		 * 출석 체크: 현재 출석 인원이 총 인원보다 크면 안 됨. 이미 꽉 찼는데 더 출석 찍으면 “이미 전원 출석했습니다.” 출력. 결석 처리:
		 * 현재 출석 인원이 0이면 더 줄일 수 없음. 그런 경우 “현재 출석 인원이 0명입니다.” 출력.
		 * 
		 * 구조 조건 while (true) + break로만 종료 처리해 보기 (굳이 run 플래그 안 써도 됨). 메뉴 분기는 switch로.
		 */

		Scanner scan = new Scanner(System.in);
		int totalStudents = 30;
		int presentStudents = 0;
		int absentStudents = 0;

		while (true) {
		    // 메뉴 출력
		    System.out.println("1.출석 체크 | 2.결석 처리 | 3.현재 출석/결석 인원 보기 | 4.종료");
		    System.out.print("선택> ");
		    int menu = Integer.parseInt(scan.nextLine());
		    switch (menu) {
		        case 1: {  // 출석 체크
		            System.out.print("출석 체크 인원> ");
		            int people = Integer.parseInt(scan.nextLine());

		            if (people <= 0) {
		                System.err.println("잘못된 시도입니다.");
		            } else if (presentStudents + absentStudents + people > totalStudents) {
		                System.err.println("총 인원을 초과했습니다.");
		            } else {
		                presentStudents += people;
		            }
		            break;
		        }
		        case 2: {  // 결석/조퇴 처리
		            System.out.print("결석 처리 인원> ");
		            int people2 = Integer.parseInt(scan.nextLine());

		            if (people2 <= 0) {
		                System.err.println("잘못된 시도입니다.");
		            } else if (presentStudents + absentStudents + people2 > totalStudents) {
		                System.err.println("총 인원을 초과했습니다.");
		            } else {
		                absentStudents += people2;
		            }
		            break;
		        }
		        case 3: {
		            System.out.println("현재 출석: " + presentStudents);
		            System.out.println("현재 결석: " + absentStudents);
		            break;
		        }
		        case 4: {
		            System.out.println("종료를 선택하셨습니다.");
		            break;
		        }
		    }

		    if (menu == 4) {
		        System.out.println("시스템 종료");
		        break;
		    } else if (presentStudents + absentStudents == totalStudents) {
		        System.out.println("전원 처리 완료 (출석 " + presentStudents + " + 결석 " + absentStudents + " = 30)");
		        break;
		    }
		}
	}
}