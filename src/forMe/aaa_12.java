package forMe;

public class aaa_12 {

	public static void main(String[] args) {
		
		for (int a=1;a<=3;a++) {
			String name="";
			int hp;
			int damage=10;
			
			
			if(a==1) {
				name="슬라임";
				hp=100;
			} else if (a==2) {
				name="늑대";
				hp = 200;
			} else {
				name="드래곤";
				hp = 500;
			}//if
			
			
			System.out.println("=== "+name+" ===");
			
			 int leftHp = hp;              // 시작 체력
	         for (int turn = 1; turn <= 50; turn++) {
	             leftHp -= damage;         // 이번 턴에 데미지만큼 감소
	             
	             if (leftHp==0) {
					System.out.println("턴 " + turn + ": " + name+" 처치 완료!");
					break;
				}
	             System.out.println(
	                 "턴 " + turn + ": " + damage +
	                 "데미지, 남은 체력: " + leftHp);
			} //in for
		}//for
		
		
		
		
		
		
		
		
		
	}

}
