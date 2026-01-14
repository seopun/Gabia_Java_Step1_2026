package chapter04;

public class ArrayTest_02 {

	public static void main(String[] args) {
		
		double[] data=new double[5];
		
		//3개만 요소대입
		
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		
		double toTal=1.0;
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			toTal*=data[i];
		}//for
		
		System.out.println("Total: "+toTal);
		// 초기화 되지 않은 2개의 값이 0.0으로 적용이 되어 Total은 0.0으로 나옴
		
		
		

	}

}
