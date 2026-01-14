package chapter06;

public class Example_person {

	// ===== 필드 =====
	public String name;
	public float height;
	public float weight;

	
	// ===== 생성자 =====
	//기본 생성자 <- person1을 만족시키기 위함.
	public Example_person() {

	}

	//이름만 입력이 가능한 오버로딩 생성자 <- person2를 만족시키기 위함
	public Example_person(String name) {
		this.name = name;
	}

	//3개 다 입력 가능한 오버로딩 생성자 <- person3를 만족시키기 위함
	public Example_person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	// ===== 메서드 =====
	//지정해준 게 없으니 일단 빈칸

}
