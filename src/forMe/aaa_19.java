package forMe;

import java.util.Random;

public class aaa_19 {

	public static void main(String[] args) {
		/*
		 * 학교에서 학생들을 4명씩 조로 나누려고 합니다. 총12명의 학생(번호 1~12)이 있고, 이들을 중복 없이 랜덤으로 3개 조에 배정하는
		 * 프로그램을 만드세요.
		 * 
		 * 조건: 학생 번호는 1~12번이다 각 조는 4명씩이다 한 학생이 여러 조에 중복으로 들어가면 안 된다 출력 형식: text 1조: 3 7
		 * 11 2 2조: 5 12 1 8 3조: 9 4 6 10
		 * 
		 * 힌트 (사용할 도구들): Random 클래스 사용, 중복 체크용 반복문, 배열 인덱스 조작 (assignedCount 활용),
		 * teamNumber로 현재 조 번호 관리
		 */

		int[] students = new int[12];
		int assignedCount=0; // 현재까지 배정된 학생 수를 세는 변수(0명부터 시작)
		int teamNumber=1; // 현재 몇 번째 조인지 나타내는 변수(1조부터 시작)
		Random rand = new Random();

		while (assignedCount < students.length) {
			int num = rand.nextInt(12) + 1;

			// 중복 체크 ver1
			boolean dup = false;
			for (int i = 0; i < assignedCount; i++) {
				if (students[i] == num) {
					dup = true;
					break;
				}
			}
			if (dup) {
				continue; // 중복이면 다시 뽑기
			}
			
		    students[assignedCount] = num;
		    assignedCount++;
		    
		    // 조 이름 출력 및 줄바꿈 관리
		    if ((assignedCount-1) % 4 == 0) {  // 0,4,8번째에 조 제목 출력
		        System.out.print(teamNumber + "조: ");
		        teamNumber++;
		    }

		    System.out.printf("%-3d", num );

		    if ((assignedCount)% 4 == 0) {  // 4,8,12번째에서 줄바꿈
		        System.out.println();
		    }
		    
			
			
			
			

		} // while

	}// main
}// class



/* 하드 코딩 ver
 * 
 * for (int i = 0; i < students.length; i++) { students[i] = rand.nextInt(12) +
 * 1;
 * 
 * // 중복 체크 ver2 
 * for (int j = 0; j < i; j++) { if (students[i] == students[j]) {
 * i--; break; } // if } // for } // for
 * 
 * 
 * System.out.println("1조"); for (int t = 0; t < 4; t++) {
 * System.out.print(students[t] + "\t"); }
 * System.out.println("\n2조"); for (int
 * t = 4; t < 8; t++) { System.out.print(students[t] + "\t"); }
 * System.out.println("\n3조"); for (int t = 8; t < 12; t++) {
 * System.out.print(students[t] + "\t"); }
 */
//여기까지가 2주차