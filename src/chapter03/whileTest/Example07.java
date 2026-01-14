package chapter03.whileTest;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int choice, count, temperature, size;
		String menu;
		int totalPrice = 0;
		
		while(run) {
			System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║       ☕ 스마트 카페 주문 시스템 ☕     ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. 커피 주문 | 2. 디저트 주문 | 3. 영수증 출력 | 4. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택>> ");
            
            choice = Integer.parseInt(scan.nextLine());
            
            if(choice ==1 ) {  // 커피 주문
            	System.out.print("주문 수량: ");
            	count = Integer.parseInt(scan.nextLine());
            	
            	System.out.print("온도 선택 (1.HOT / 2.ICE): ");
            	temperature = Integer.parseInt(scan.nextLine());
            	
            	System.out.print("사이즈 (1.Regular / 2.Large): ");
            	size = Integer.parseInt(scan.nextLine());
            	
            	System.out.println("\n === 커피 주문 내역 ===");
            	
            	int price = 0;
            	String tempStr = "";
            	String sizeStr = "";
            	
            	// if 문으로 온도 판단
            	if(temperature==1) {
            		tempStr = "HOT";
            		price = 4000;
            	} else if (temperature==2) {
					tempStr = "ICE";
					price = 4500;
				} else {
					System.out.println("잘못된 온도 선택!\n");
					continue;
				}
            	
            	// if 문으로 사이즈 판단
            	if(size==1) {
            		sizeStr = "Regular";
            	} else if (size==2) {
            		sizeStr = "Large";
            		price+=500;
            	} else {
            		System.out.println("잘못된 사이즈 선택!\n");
            		continue;
            	}
            	
            	for (int i=1;i<=count;i++) {
            		System.out.println(i+". "+tempStr+" 아메리카노 ("+sizeStr+") - "+price+"원");
            	}
            	
            	totalPrice = price*count;
            	System.out.println("☑ 총 금액: " + totalPrice+"원\n");
            	
            	
            } else if (choice ==2) { // 디저트 주문
            	System.out.print("디저트 종류 (케이크/쿠키/마카롱): ");
            	menu = scan.nextLine();
            	
            	System.out.print("주문 수량: ");
            	count = Integer.parseInt(scan.nextLine());
            	
            	System.out.println("\n === 디저트 주문 내역 ===");
            
            	int dessertPrice = 0;
            	String emoji = "";
            	
            	// if 문으로 디저트 가격 계산
            	if(menu.equals("케이크")) {
            		dessertPrice = 6000;
            		emoji = "🍰";
            	} else if(menu.equals("쿠키")) {
            		dessertPrice = 3000;
            		emoji = "🍪";
				} else if(menu.equals("마카롱")) {
            		dessertPrice = 2500;
            		emoji = "🧁";
            	} else {
					System.out.println("잘못된 메뉴 선택!\n");
					continue;
				}
            	
            	// for문으로 주문 출력
            	for (int i=1;i<=count;i++) {
            		System.out.println(i+". "+emoji +" "+ menu + " - "+dessertPrice+"원");
            	}
            	
            	totalPrice = dessertPrice*count;
            	
            	//if문으로 할인 적용
            	if(count>=3) {
            		int discount = (int)(totalPrice*0.1); //10% 할인
            		System.out.println(" 3개 이상 구매 할인! -"+discount+"원");
            		totalPrice -= discount;
            	}
            	System.out.println("☑ 총 금액: " + totalPrice+"원\n");
				
			} else if (choice==3) {
    			System.out.println("\n╔═══════════════════════════════════════╗");
                System.out.println("║            📜 영 수 증 📜             ║");
                System.out.println("╠═══════════════════════════════════════╣");
                System.out.println("║  스마트 카페에서 구매해주셔서         ║");
                System.out.println("║  감사합니다                           ║");
                System.out.println("╚═══════════════════════════════════════╝\n");
			} else {
				run = false;
			}
			

			
			
			
			
		}// while

	}

	/* 내가 만들던 코드. 개 노가다.
	if (temperature==1) {
		T = "HOT";
		System.out.print("사이즈 (1.Regular / 2.Large): ");
    	size = Integer.parseInt(scan.nextLine());
    	if(size==1 ) {
    		S = "Regular";
    	} else if (size==2) {
    		S= "Large";
    	} else {
    		System.out.println("잘못 입력하셨습니다.");
    		continue;
    	}//if
	} else if (temperature==2){
		T = "ICE";
		System.out.print("사이즈 (1.Regular / 2.Large): ");
    	size = Integer.parseInt(scan.nextLine());
    	if(size==1 ) {
    		S = "Regular";
    	} else if (size==2) {
    		S= "Large";
    	} else {
    		System.out.println("잘못 입력하셨습니다.");
    		continue;
    	}//if
	} else {
		System.out.println("잘못 입력하셨습니다.");
		continue;
		}//if 
	
	System.out.println("");
	System.out.println("=== 커피 주문 내역 ===");
	
	for (i=1;i<=count;i++) {
		System.out.println(i+". "+T+" 아메리카노 ("+S+") - 5000원");
	}//for
	System.out.println("");
	System.out.println("총 금액: "+5000*count+"원");
	continue;
	*/
}
