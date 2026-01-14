package forMe;

import java.util.Random;

import javax.swing.JOptionPane;

public class aaa_18 {

	public static void main(String[] args) {
		// MyLottoBonus
		int buyCount;// 사용자가 입력한 구매 횟수 저장용
		int ticketIndex = 0;// 현재 몇 번째 로또를 출력 중인지 카운트
		int[] lottoNumbers = new int[6];// 기본 6개 번호 저장
		int bonusNumber=0;// 보너스 번호 하나 저장
		Random rand = new Random();// 랜덤 객체
		// lotto[i]=rand.nextInt(45)+1; 의 식으로 random 객체의 최적화도 가능

		System.out.println("========보너스 포함 로또 예상번호========");
		buyCount = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));

		while (buyCount > ticketIndex) {
			System.out.print("[ " + (ticketIndex + 1) + " ]");

			no: for (int i = 0; i < lottoNumbers.length; i++) {
				lottoNumbers[i] = rand.nextInt(45) + 1;

				// 중복 체크용 for문
				for (int j = 0; j < i; j++) {
					if (lottoNumbers[i] == lottoNumbers[j]) {
						i--;
						continue no;
					} // if
				} // in for
				System.out.print(lottoNumbers[i] + " ");

			} // out for

			/*
			 * // 보너스 넘버 for(int k=0;k<99;k++) { bonusNumber = rand.nextInt(45)+1; if
			 * ((bonusNumber!= lottoNumbers[0])&&(bonusNumber!=
			 * lottoNumbers[1])&&(bonusNumber!= lottoNumbers[2])&&(bonusNumber!=
			 * lottoNumbers[3])&&(bonusNumber!= lottoNumbers[4])&&(bonusNumber!=
			 * lottoNumbers[5])){ break; }else { continue; } }//for
			 */

			while (true) {
				bonusNumber = rand.nextInt(45) + 1;
				
				boolean isDuplicate = false; // isDuplicate는 변수방 이름일 뿐임.
				
				for (int k = 0; k < lottoNumbers.length; k++) {
					if (bonusNumber == lottoNumbers[k]) {
						isDuplicate = true;
						break;
					} // if
				}//for
				
				if (!isDuplicate) {  // 중복이 없으면(isDuplicate==false)
				      break;  // while 탈출
				}//if

				
			} // in while
			ticketIndex++;
			System.out.println("(보너스:"+bonusNumber+")");
		} // while


	}// main

}// class

/*
 * //bonusNumber bonusNumber = rand.nextInt(45)+1; if
 * (bonusNumber==lottoNumbers[i]) { continue; } System.out.println(bonusNumber);
 */
