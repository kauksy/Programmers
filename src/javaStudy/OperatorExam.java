package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연산: 데이터를 처리하여 결과를 산출
		 * 연산자: 연산에 사용되는 표시나 기호(-,+,ㅊ*...)
		 * 피연산자: 연산 대상이 되는 데이터(리터럴, 변수)
		 * 연산식: 연잔자와 피연사를 이용하여 연산의 과정을 기술
		 * 
		 * 연산자: 부호연산자 (+, -)=> 단항연산자
		 * 산술연산자: (+, -, *, /, %(나머지 값을 구하는 연산자, 모듈러연산자))
		 * 증감연산자 (++,--)=> 단항연산자
		 * 
		 * */
		
		int i1 =-5; // -가 연산자, 5가 피연산자
		int i2 = +i1; // + 붙여봤자 부호 그대로 유지
		int i3 =-i1; // -앞에 - 붙여야 +로 변환
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1 과 동일 => *1을 더하고 대입
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; //i3 = i3+1 과 동일 //* 대입하고 1을 더함
		System.out.println(i5);
		System.out.println(i3);
		
		
		int i=5;
		int j =2;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); // 정수 나누기 정수 = 값도 정수, 둘중 하나가 double이면 값도 실수로 나온다.
		System.out.println(i/(double)j); //캐스팅 변환
		System.out.println((double)i/j); //캐스팅 변환 
		System.out.println(i%j);


	}

}
