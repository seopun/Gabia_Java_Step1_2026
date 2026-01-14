package chapter04;

public class ArrayTest_03 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		int size = 0;
		
		//대입연산
		data[0]=10.0;
		size++; //size=size+1; -> 1
		data[1]=20.0;
		size++; // -> 2
		data[2]=30.0;
		size++; // -> 3
		
		double toTal=1.0;
		
		System.out.println(size);
		System.out.println(data[3]);
		System.out.println(data[4]);
		
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
			toTal*=data[i];
		}
		
		System.out.println("Total: "+toTal);
		
		
		
		
		
		
		
	}

}
