package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 비교연산자
		 * 같다(==), 다르다, 크다/작다, 크거나같다, 작거나 같다
		 * 비교연산자의 값은 불린값이다.
		 * */
		int i=10; // 단순 대입연산자 (=)
		int j= 10;
		
		System.out.println(i==j); //true
		System.out.println(i!=j); //false
		System.out.println(i<j); //false
		System.out.println(i<=j); //true
		System.out.println(i>j); //false
		System.out.println(i>=j); //true
		
		boolean c = (i>j); // 괄호 안쳐도 되긴 됨
		System.out.println(c);
		// 복합대입 연산자
		i +=10; // i=i+10과 동일 
		System.out.println(i);
		System.out.println(i-=5); // 20에 5를 빼서 다시 i에 대입

	}
}
