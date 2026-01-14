package chapter06;

import javax.swing.JOptionPane;

public class SungJuk_01 {

    // ===== 멤버 변수(필드, 속성) =====
    // private: 클래스 외부에서 직접 접근 불가 (캡슐화)
    // 같은 클래스 내부에서만 접근 가능
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	// ===== 생성자 =====
	/*
	public SungJuk_01() {
        // 기본 생성자는 명시하지 않아도 자동으로 생성됨
        // 하지만 다른 생성자가 있으면 기본 생성자는 자동 생성 안 됨
	}
	*/
	
    // ===== 메서드(기능) =====
	
    // 총점 계산 및 출력 메서드
	public void Sum() {
		int total=java+oracle+spring;
		System.out.println("총점: "+total);
	}//Sum
	
    // 평균 계산 및 출력 메서드
	public void Avg() {
		double avg = (double) (java + oracle + spring) / 3;
		System.out.println("평균: " + avg);
	}//Avg
	
    // ================================
    // main 메서드: 프로그램의 시작점 (Entry Point)
    // ================================
	
	public static void main(String[] args) {

        // 객체 생성: new 키워드로 SungJuk_01 클래스의 인스턴스 생성
        // static이 아닌 멤버를 사용하려면 반드시 객체 생성 필요
		SungJuk_01 rec = new SungJuk_01();
		
        // JOptionPane.showInputDialog(): 사용자 입력을 받는 대화상자
        // 입력값은 String 타입으로 반환됨
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("이름");
		
        // Integer.parseInt(): String을 int로 변환
        // private 변수지만 같은 클래스 내부이므로 직접 접근 가능
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스트링점수"));
		
        // 결과 출력: 학생 정보 헤더
		System.out.println("학번-" + rec.std_num + "|성명-" + rec.std_name + "님의 성적입니다.");
		System.out.println("------------------------------------------------------------------");

        // 객체의 메서드 호출
		rec.Sum();
		rec.Avg();
		
		
		
	}

}
