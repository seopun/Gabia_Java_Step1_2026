package forMe;

import java.util.Scanner;

public class aaa_2 {

	public static void main(String[] args) {
		/*
		 * Scanner로 오늘의 **총 운동 시간(totalMinutes)**을 입력받으세요. (예: 130분)
		 * 이를 **시간(hour)**으로 환산하세요 (/ 60).
		 * 남은 **분(minute)**을 계산하세요 (% 60).
		 * 삼항연산자를 사용하여, 운동 시간이 2시간 이상(hour >= 2)이면 "오늘 득근하셨네요!", 아니면 "조금 더 분발합시다!"를
		 * 출력하세요.
		 * 최종적으로 "총 운동 시간: O시간 O분" 형식으로 출력하세요.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("총 운동 시간(단위:분): ");
		int totalMinutes = scan.nextInt();

		int hour = totalMinutes / 60;
		int minute = totalMinutes % 60;

		String str = hour > 2 ? "오늘 득근하셨네요!" : "좀 더 분발합시다!";
		System.out.println(str);
		System.out.println("총 운동 시간: " + hour + "시간 " + minute + "분");

	}

}
