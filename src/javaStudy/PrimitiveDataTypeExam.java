package javaStudy;

public class PrimitiveDataTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFun = false; 
		System.out.println(isFun);
		
		char c = 'A'; // char 는 반드시 작은 따옴표, 문자1개만가능
		
		// 정수: int의 범주 < long의 범주
		// int type의 최대값은 2147483647 입니다.
		// 더 큰 값을 사용하고 싶을때는 long 형을 사용하고, 
		// 값뒤에 알파벳 L 을 붙입니다.
		int x = 59; // 59라는 값 자체를 리터럴이라한다.
		
		long bing = 234562L; // long타입은 반드시 뒤에 L을 붙여주어야함
		
		// 실수: float의 범주 < double의 범주
		float f = 32.4f; // 실수도 역시 f 붙이고
		
		double d =234.5;
	}

}
