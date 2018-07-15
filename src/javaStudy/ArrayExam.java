package javaStudy;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1차원 배열*/
		// 배열은 변수는 하나인데 값은 여러개 => 참조형 데이타
		// 배열은 처음 선언할 때 만들어진 크기가 변하지 않는다.
		int [] array1 = new int[100];
		
		// index: 몇번쨰에 담을 것이냐?
		array1[0] = 50;
		array1[10] = 100;
		
		// 배열의 선언과 초기화 동시에 하기 
		int [] array2 = new int[]{1, 2, 3, 4};
		int [] array3 = {1,2,3,4};
		
		// 배열에서 꺼내쓰기
		System.out.println(array3[0]);
		int value = array3[2];
		System.out.println(value);

	}

}
