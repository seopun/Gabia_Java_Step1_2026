package forMe;

public class aaa_14 {

	public static void main(String[] args) {
		int ballCount = 30;

		int magikarpCatch = 0;
		int pikachuCatch = 0;
		int taurosCatch = 0;

		for (int i = 1; i <= ballCount; i++) {

		    // 1) 어떤 포켓몬이 나올지 결정
		    double r = Math.random();   // 0.0 ~ 1.0
		    String pokemon;
		    double catchRate;

		    if (r < 0.6) {              // 60%
		        pokemon = "잉어킹";
		        catchRate = 0.7;        // 70%
		    } else if (r < 0.9) {       // 다음 30%
		        pokemon = "피카츄";
		        catchRate = 0.4;        // 40%
		    } else {                    // 나머지 10%
		        pokemon = "켄타로스";
		        catchRate = 0.15;       // 15%
		    }

		    // 2) 잡히는지 판정
		    double r2 = Math.random();  // 0.0 ~ 1.0
		    boolean caught = r2 < catchRate;

		    if (caught) {
		        if (pokemon.equals("잉어킹")) {
		            magikarpCatch++;
		        } else if (pokemon.equals("피카츄")) {
		            pikachuCatch++;
		        } else {
		            taurosCatch++;
		        }
		        System.out.println(i + "번째 볼: " + pokemon + "을(를) 잡았다!");
		    } else {
		        System.out.println(i + "번째 볼: "+pokemon+"이(가) 볼에서 나왔다...");
		    }//if
		}//for
		
		System.out.println("\n=== 사파리존 결과 ===");
		System.out.println("잉어킹: " + magikarpCatch + "마리");
		System.out.println("피카츄: " + pikachuCatch + "마리");
		System.out.println("켄타로스: " + taurosCatch + "마리");

	}

}
