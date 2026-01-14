package chapter05;

import javax.swing.JOptionPane;

public class FuncTest_02 { // 인스터스 메서드

	// 인스턴스 메서드: 객체 생성 후 호출 가능
	// 인스턴스 메서드 vs static 메서드
	// - 인스턴스: 객체마다 독립적으로 동작, 인스턴스 변수 접근 가능
	// - static: 클래스 레벨에서 공유, 인스턴스 변수 접근 불가
	public void sum(int num1, int num2) {
		// 메서드 코드는 Method Area에 저장
		// 실행 시 Stack에 프레임 생성, num1, num2, sum은 Stack에 저장
		// static의 단점: 프로그램 종료까지 메모리 상주, 남용 시 메모리 낭비

		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
	}// main

	// --------------------------------------------------------------------------------

	public static void main(String[] args) {

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));

	    // 객체 생성 과정:
	    // 1. Heap에 FuncTest_02 객체 생성
	    // 2. obj 참조변수는 Stack에 저장, Heap 주소를 가리킴
		FuncTest_02 obj = new FuncTest_02();
		
		// obj 참조변수는 Stack, 실제 객체는 Heap에 저장
	    // 메서드 호출 과정:
	    // 1. Stack에 sum() 프레임 생성
	    // 2. a→num1, b→num2로 값 복사
	    // 3. sum() 실행 완료 후 프레임 제거 (LIFO)
		obj.sum(a, b);
	}

}

/*
 * JVM 메모리 구조 (Runtime Data Area)
 * 
 * 1. Method Area (Metaspace, Java 8+, Native Memory 위치)
 *    - 클래스 메타데이터 (클래스명, 메서드 정보, 필드 정보)
 *    - 모든 메서드 코드 (static/인스턴스 구분 없이)
 *    - static 변수
 *    - 런타임 상수 풀
 *    - 특징: 프로그램 시작~종료까지 유지, GC 대상 아님
 * 
 * 2. Stack Area (스레드마다 독립적으로 생성)
 *    - 메서드 호출 스택 프레임 (LIFO 구조)
 *    - 지역변수, 매개변수
 *    - 기본형: 실제 값 저장
 *    - 참조형: 참조값(주소) 저장, 실제 객체는 Heap에
 *    - 특징: 메서드 종료 시 자동 해제
 * 
 * 3. Heap Area (모든 스레드가 공유)
 *    - 객체, 배열 (new로 생성)
 *    - 인스턴스 변수
 *    - 특징: GC가 관리, 사용되지 않는 객체 자동 삭제
 */
