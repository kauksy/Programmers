package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 인덱스를 통해서 접근한다.

		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println("배열의 길이: " + iarray.length);
		
		// iarray.length의 크기를 출력
		for(int i = 0; i < iarray.length; i++){
			// 1~ 100까지 배열 숫자 채울 수 있음
			iarray[i] =i+1; 
		}
		
		// 변수의 scope: 변수를 사용할 수 있는 적용범위 
		// (예: for블럭 안에서 사용 된 i는, for블럭 안에서만 사용가능)
		int sum = 0;
		for(int i = 0 ; i < iarray.length; i++){
			sum = sum+iarray[i];
		}
		System.out.println("배열 내 요소를 모두 더함: " + sum);

	}

}
