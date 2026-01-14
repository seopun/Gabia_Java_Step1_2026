package chapter05;

public class Example03 {

	public static int findMax(int[] arr) {
		
		int max = 0;
		
		
		//for문을 통한 최대값 구하기
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}//if
		}//for
		
		/*
		//향상된 for문
		for(int num:arr) {
			if(max< num) {
				max=num;
			}//if
		}//for
		*/
		
		return max;
		
	}// findMax

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,8,51};
		
		int maxnum= findMax(numbers);
		System.out.println("최대값: "+ maxnum);
		
	}

}
