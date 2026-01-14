package forMe;

import java.util.Scanner;

public class aaa_17 {

	public static void main(String[] args) {
		/*
		 * 1. 힘 올리기 (1 포인트 사용) 2. 민첩 올리기 (1 포인트 사용) 3. 지능 올리기 (1 포인트 사용) 
		 * 4. 현재 스탯 보기 5.스탯 초기화 (포인트 10으로 리셋, 모든 능력치 0으로) 6. 종료
		 */

		Scanner scan = new Scanner(System.in);
		int statPoints = 10; // 남은 스탯 포인트
		int strength = 0; // 힘
		int agility = 0; // 민첩
		int intelligence = 0; // 지능
		int menu; // 메뉴 선택 번호
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.힘 | 2.민첩 | 3.지능 | 4.현재 스탯 | 5.스탯 초기화 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			menu=Integer.parseInt(scan.nextLine());
			
			if(menu<1||menu>6) {
				System.out.println("숫자를 잘못 입력하셨습니다.");
				System.out.println("");
				continue;
			}//if
			
			if (statPoints <= 0 && (menu == 1 || menu == 2 || menu == 3)) {
			    System.out.println("스탯 포인트를 전부 사용하셨습니다.");
			    System.out.println("캐릭터를 생성하시겠습니까? (네/아니오)");
			    String a = scan.nextLine();
			    if (a.equals("네")) {
			        run = false;
			    }
			    continue;  // 다음 반복으로
			}

			switch(menu) {
			    case 1:
			        if (strength == 5) {
			            System.out.println("해당 능력치는 이미 만렙입니다.");
			            continue;
			        }
			        System.out.println("힘이 1 올랐습니다. (남은 포인트:"+(statPoints-1)+")");
			        strength++;
			        statPoints--;
			        break;
			    
			    case 2:
			        if (agility == 5) {
			            System.out.println("해당 능력치는 이미 만렙입니다.");
			            continue;
			        }
			        System.out.println("민첩이 1 올랐습니다. (남은 포인트:"+(statPoints-1)+")");
			        agility++;
			        statPoints--;
			        break;
			    case 3:
			        if (agility == 5) {
			            System.out.println("해당 능력치는 이미 만렙입니다.");
			            continue;
			        }
			        System.out.println("지능이 1 올랐습니다. (남은 포인트:"+(statPoints-1)+")");
			        intelligence++;
			        statPoints--;
			        break;
			    case 4:
			    	System.out.println("스탯 확인을 선택하셨습니다.");
			    	System.out.println("힘(str): "+strength+"| 민첩(agi): "+agility+"| 지능(int): "+intelligence);
				
			    	break;
			    case 5:
			    	System.out.println("스탯 초기화를 선택하셨습니다.");
					strength=0; agility=0; intelligence=0;
					statPoints=10;
					break;
			    case 6:
			    	System.out.println("종료를 선택하셨습니다.");
			    	run=false;
			    	break;
			
			}//switch
			
		}//while
		
		System.out.println("캐릭터 생성 완료! 최종 스탯: 힘: "+strength+", 민첩: "+agility+", 지능: "+intelligence);
		
		
	}//main

}//class
