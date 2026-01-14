package chapter04;

public class ArrayTest_07 {

	public static void main(String[] args) {
		
		// 이차원 배열
		int arr[][]=new int[2][3]; //2행 3열(가로줄2, 세로줄3)
		int n=0;
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				n++; //1
				System.out.print((arr[i][j]=n)+" ");
			}//in for  i(행)는 고정, j가 0 ~ arr[i].length-1까지 돌면서 한 행의 모든 열을 채움
			
			System.out.println();
		}//out for
		
		System.out.println("------------------------");
		System.out.println(arr.length+"행");  // 행 개수: 2 (0행, 1행)
		System.out.println(arr[0].length+"열");  // 열 개수: 3 (각 행에 3개 칸)
		System.out.println("------------------------");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}//in for 행 고정. j<arr[i] 때문에 한 행을 다 채우고서야 밖으로 나가게 됨
			
			System.out.println();
		}//out for
		
		
		
		
		
		
		
	}

}
