package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2차원 배열에 값을 저장하는 방법
		 * 만약 array4[1] = 10 ; 이렇게 사용하면 오류!!
		 * array4[1] 은 또 다른 1차원 배열을 가리킬 수 있는 참조형 변수이기 때문에 값을 담을수는 없다.
		 * */
		// 2차원 배열: 배열의 배열이다.
		// 세로3, 가로 4
		int [] [] array2 = new int [3][4];
		array2[0][1] = 10;
		
		// 메모리에는 세로3개만 만들어진 상태
		int[][] array4 = new int[3][];
		
		// 가변크기의 2차원 배열을 생성하는 방법
		// 이렇게 선언하면 하기와 같은 모양으로 만들어 진다
		//	0
		//	0 0
		//	0 0 0
		array4[0] = new int[1];
		array4[1] = new int[2];
		array4[2] = new int[3];
		array4[0][0] = 5;
		
		// 선언과 동시에 초기화
		int[][]array5 = {{1}, {1,2}, {1,2,3}};
		System.out.println(array5[2][1]);
		

	}

}
