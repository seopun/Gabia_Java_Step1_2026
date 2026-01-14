package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto_11 {

	public static void main(String[] args) {
		// 로또 추첨기 프로그램
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		// Random rand=new Random(); 
		//lotto[i]=rand.nextInt(45)+1; 의 식으로 random 객체의 최적화도 가능
		
		System.out.println("========이번주 로또 예상번호========");
		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		
		while(number>cnt) {
			System.out.print("[ "+(cnt+1)+" ]");
			
			outer:for(int i=0;i<lotto.length;i++) {
				lotto[i]=new Random().nextInt(45)+1; //근데 이러면 숫자가 중복으로 나올 수 있음
				
				// 중복 체크용 for문
				// j는 0 ~ i-1까지만 돌려서, 이미 채워진 앞 요소들과만 비교한다.
				// j가 없으면 lotto[i] == lotto[i]가 되어 항상 true라서 비교 의미가 없다.
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--; // 이게 없으면 해당 인덱스를 건너뛰어서 배열이 완전히 안 채워짐
						continue outer; //분기점(outer)로 이동. 라벨은 꼭 'outer'일 필요 없음. 일치하기만 하면 됨.
					}//if
				}//in for
				System.out.print(lotto[i]+" ");
			}//out for
			
			cnt++;
			System.out.println();
		}//while. 참고로 >cnt인 이유는 cnt가 0부터 시작하기 때문. cnt가 1부터 시작한다면 >=
		
		
		
		

	}

}
