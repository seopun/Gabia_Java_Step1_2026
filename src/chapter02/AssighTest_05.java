package chapter02;

public class AssighTest_05 {

	public static void main(String[] args) {
		// 전위연산
		System.out.println("===전위연산===");
		int gameScore = 150;

		// #1 ++gameScore => gameScore=gameScore+1;
		int lastScore1 = ++gameScore;
		System.out.println(gameScore); // 151
		System.out.println(lastScore1); // 151
		System.out.println("--------------------");

		// #1 --gameScore => gameScore=gameScore-1;
		int lastScore2 = --gameScore;
		System.out.println(gameScore); // 150
		System.out.println(lastScore2); // 150
		System.out.println("--------------------");

		// 후위연산
		System.out.println("===후위연산===");

		// #2 gameScore++ => gameScore=gameScore+1;
		int lastScore3 = gameScore++;
		System.out.println(lastScore3); // 150
		System.out.println(gameScore); // 151
		System.out.println("--------------------");

		// #2 --gameScore => gameScore=gameScore-1;
		int lastScore4 = gameScore--;
		System.out.println(lastScore4); // 151
		System.out.println(gameScore); // 150
		System.out.println("--------------------");

	}

}
