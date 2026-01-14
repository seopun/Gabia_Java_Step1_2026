package chapter04;

public class EnhancedForLoop_09 {

	public static void main(String[] args) {
		
		String strArray[] = { "Java", "Oracle", "HTML5", "CSS", "JSP", "Spring", "Python" }; //원소들
		
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+" ");
		}
		
		System.out.println();
		
		for(String lang:strArray) {
			System.out.print(lang+" ");
		}//확장된 for문. : 는 규칙임. = 안 됨.
		
		

	}

}
