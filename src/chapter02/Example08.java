package chapter02;

public class Example08 {

	public static void main(String[] args) {
		/*
		 * 1. 피자는 총 5판이 있고, 한 판당 8조각입니다.
		 * 2. 친구는 12명입니다.
		 * 3. 친구 한 명당 먹을 수 있는 피자 조각 수를 계산하세요.
		 * 4. 남는 피자 조각 수를 계산하세요.
		 * 5. 결과를 출력하세요.
		 */
		
		int pizza =5;
		int slicePerPizza = 8;
		int friends = 12;
		
		int totalSlices = pizza*slicePerPizza;
		
		int slicePerFriend = totalSlices / friends;
		System.out.println("친구 한 명당: " + slicePerFriend + "조각");
		
		
		int leftOver = totalSlices % friends;
		System.out.println("남는 조각: " +leftOver + "조각");
		
		
		
		/*int pizza = 5;
		int friend = 12;
		int piece = 8*pizza;
		
		int result = piece/friend;
		int result2 = piece%friend;
		
		System.out.println("총 피자 조각 수: "+piece+"조각");
		System.out.println("친구 한 명당 먹을 수 있는 피자 조각 수: "+result+"조각");
		System.out.println("남는 피자 조각 수: "+result2+"조각");*/
				
		
		
	}

}
