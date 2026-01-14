package forMe;

public class aaa_13 {

	public static void main(String[] args) {
		
		int slimeCount = 0;
		int wolfCount = 0;
		int dragonCount = 0;
		
		
		for(int i=1;i<=10;i++) {
			int count = (int)(Math.random()*100)+1;//1~100 난수
			String monster;
			
			if (count<=50) {
				monster="슬라임";
				slimeCount++;
			} else if (count<=85) {
				monster="늑대";
				wolfCount++;
			} else {
				monster="드래곤";
				dragonCount++;
			}//if
			System.out.println(i+"번째 탐험: "+monster+"을(를) 조우했다!");
			
			if (dragonCount>=3) {
				System.out.println("드래곤을 "+dragonCount+"번 조우했다! 게임 오버!");
				break;
			}
			
			
			
			
			
		}//for
		
		 System.out.println("=== 탐험 결과 ===");
	     System.out.println("슬라임: " + slimeCount + "번");
	     System.out.println("늑대: " + wolfCount + "번");
	     System.out.println("드래곤: " + dragonCount + "번");

	}

}
