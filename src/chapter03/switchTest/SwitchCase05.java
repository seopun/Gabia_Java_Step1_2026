package chapter03.switchTest;

public class SwitchCase05 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*10)+1;
		//System.out.println(num);
		
		switch (num) {
		case 1:
		case 2:
		case 3:
		{
			System.out.println("점수를 획득 하지 못했습니다");
			break;
		}
		default:
			System.out.println(num+" 점수를 획득 하였습니다");
		}//switch
		
	}

}
