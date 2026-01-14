package chapter03.forTest;

public class For10 {

	public static void main(String[] args) {
		// 3명의 캐릭터
        for(int character = 1; character <= 3; character++) {
            
            String name = "";
            int baseGold = 0;
            
            // 캐릭터 종류 결정
            if(character == 1) {
                name = "전사";
                baseGold = 1000;
            } else if(character == 2) {
                name = "마법사";
                baseGold = 1500;
            } else {
                name = "궁수";
                baseGold = 1200;
            }
            
            System.out.println("=== " + name + " ===");
            
            int totalGold = 0;  // 누적 골드
            
            // 레벨 1 → 5까지 레벨업
            for(int level = 1; level < 5; level++) {
                int reward = baseGold * level;  // 레벨업 보상
                totalGold += reward;  // 누적
                
                System.out.println("레벨 " + level + " → " + (level + 1) + 
                                   ": " + reward + "골드, 누적: " + totalGold + "골드");
            }
            
            System.out.println(name + " 총 획득 골드: " + totalGold + "골드");
            System.out.println();
        }
        
        System.out.println("게임 끝! 모험을 즐기세요!");
		
		
		
		/*
		for (int item = 1; item <= 3; item++) {

			String name = "";
			int price;
			int total = 0;

			if (item == 1) {
				name = "전사";
				price = 1000;
			} else if (item == 2) {
				name = "마법사";
				price = 1500;
			} else {
				name = "궁수";
				price = 1200;
			}

			System.out.println("=== " + name + " ===");

			for (int level = 1; level <= 4; level++) {
				
				total+=(price * level);//total = total+(price*level)
				System.out.println("레벨 " +level + " → "+(level+1)+": "+ (price * level)+"골드, 누적: "+(total)+"골드");
				
				
			} //in for
			
			System.out.println(name+" 총 획득 골드: "+total+"골드");
			System.out.println();
		} //out for
		
		System.out.println("게임 끝! 모험을 즐기세요!");
		*/
		
		
	}//main

}//class
