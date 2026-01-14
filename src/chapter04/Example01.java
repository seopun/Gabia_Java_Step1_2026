package chapter04;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열 점수의 총점과 평균을 줄단위로 출력하시오.
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0; // 현재 행의 평균을 저장할 변수
		int count; // 현재 행에서 원소(점수)의 개수를 세는 변수
		int sum[] = new int[3]; // 각 행의 총점을 저장할 배열(0행,1행,2행)

		// for문을 이용 -> 각 행을 가져와서 / 각행의 열을 읽어서
		// sum에 누적하고(count++) 평균까지 구하여 출력
		for (int i = 0; i < array.length; i++) { // i형 인덱스: 0,1,2
			count = 0;
			/*
			 * count 초기화는 "이 행에서 다시 0부터 세겠다"는 의미이므로, 
			 * 보통은 여기(바깥 for 안, 안쪽 for 시작 전)에 두는 것이 가장
			 * 직관적이다. 그 후에 안쪽 for에서 count++를 하게 된다. 
			 * 이번 코드는 아래에서 0으로 리셋하는 방식도 사용 가능하지만, 행마다
			 * 명확히 초기화하고 싶다면 여기에서 count = 0;을 해주는 편이 좋다.
			 */

			for (int j = 0; j < array[i].length; j++) {   // i행의 각 열(점수)을 순회
				System.out.print((array[i][j]) + " ");   // 현재 점수 출력
				sum[i] += array[i][j];   // i행의 총점에 현재 점수를 누적
				count++;     // i행에서 본 점수 개수를 1 증가
			} // in for

            // count에는 현재까지 센 점수 개수가 들어 있으므로 평균 계산에 사용
            // 또는 array[i].length를 사용해도 동일한 결과가 나온다.
			avg = (double) sum[i] / count;   // avg = sum[i] / array[i].length; 로도 가능
			System.out.println("\n" + i + "행의 합: " + sum[i]);
			System.out.printf(i + "행 평균: %.3f\n", avg);
			System.out.println("-------------------------------");
			
			// 다음 행(i+1)을 계산할 때는 다시 0부터 세야 하므로 여기서 count를 0으로 되돌린다.
            // 이 위치에 둘 경우, "현재 행의 평균 계산과 출력이 끝난 뒤에 초기화"되는 구조가 된다.
			count = 0;
		} // out for

	}//main

}//class
