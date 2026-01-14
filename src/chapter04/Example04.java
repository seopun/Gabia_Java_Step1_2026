package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		//학생수를 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		
		boolean run = true;
		
		int studentNum = 0;
		int[] score = null; //배열 참조변수를 null로 초기화
		//배열을 초기화할 때는 score = new int[studentNum]의 형태.
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scan.nextLine()); //nextLine()으로 문자열로 받아 정수로 변환
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum]; // 배열의 첨자 정의 = 메모리 확보
				
			} else if (selectNo == 2) {
				for(int i=0;i<score.length;i++) {
					System.out.print("score["+(i+1)+"]> ");
					score[i] = Integer.parseInt(scan.nextLine()); // score 배열방에 요소 저장
				}//for1
				
			} else if (selectNo == 3) {
				for(int i=0;i<score.length;i++) {
					System.out.print("score["+(i+1)+"]> " + score[i]+"\n");
				}//각 if-else if 블록 내 for문의 스코프가 독립적이므로 int i를 각각 선언 가능
				
			} else if (selectNo == 4) {
				int max=0;
				int sum=0;
				double avg = 0.0;
				
				for(int i=0;i<score.length;i++) {
					
					// 최고 점수(삼항연산자)
					max = max < score[i] ? score[i]:max;
					
					// 최고 점수 (if문)
					/*  
					if(max < score[i]) {
						max = score[i];
					}
					*/
					
					// 총점
					sum+=score[i];
									
				}//for3
					//평균
					avg = sum / (double)studentNum; // 캐스팅
					
					System.out.println("최고점수: "+max);
					System.out.println("총점: "+sum);
					System.out.println("평균: "+avg);
				
			} else if (selectNo == 5) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;
			} else {
				System.out.println("없는 서비스 번호를 입력하셨습니다.");
				continue;
			}//if
			
			
			
			
			
		}//while
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}//main

}//class
