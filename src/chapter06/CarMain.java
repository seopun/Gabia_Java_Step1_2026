package chapter06;

public class CarMain {

	public static void main(String[] args) {
		
		Car_04 myCar = new Car_04(); //객체 생성은 new로. 객체는 힙메모리.
		

		//접근 지정자가 public이기 때문에 가능하다
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);

		myCar.speed=60;
		System.out.println("현재속도: "+myCar.speed);
		
		
		
		
	}//main

}
