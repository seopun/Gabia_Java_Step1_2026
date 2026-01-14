package chapter04;

public class ArrayTest_06 {

	public static void main(String[] args) {

		int score[] = {98,90,87};
		int sum = 0;
		/*
		 * for이용 score점수 출력 => 
		score[0]: 98 sum변수방에 점수 누적 avg변수방 선언후 평균 출력(단 실수타입)
		 */
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]: "+score[i]);
			sum+=score[i];
		}//for
		
		System.out.println("\n총점: "+sum);
		double avg = (double) sum/(score.length);
		System.out.println("평균: "+avg);
		System.out.println("평균(반올림): "+Math.round(avg));
		System.out.printf("평균(소수점 3자리): %.3f",avg);

	}

}
