package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2���� �迭�� ���� �����ϴ� ���
		 * ���� array4[1] = 10 ; �̷��� ����ϸ� ����!!
		 * array4[1] �� �� �ٸ� 1���� �迭�� ����ų �� �ִ� ������ �����̱� ������ ���� �������� ����.
		 * */
		// 2���� �迭: �迭�� �迭�̴�.
		// ����3, ���� 4
		int [] [] array2 = new int [3][4];
		array2[0][1] = 10;
		
		// �޸𸮿��� ����3���� ������� ����
		int[][] array4 = new int[3][];
		
		// ����ũ���� 2���� �迭�� �����ϴ� ���
		// �̷��� �����ϸ� �ϱ�� ���� ������� ����� ����
		//	0
		//	0 0
		//	0 0 0
		array4[0] = new int[1];
		array4[1] = new int[2];
		array4[2] = new int[3];
		array4[0][0] = 5;
		
		// ����� ���ÿ� �ʱ�ȭ
		int[][]array5 = {{1}, {1,2}, {1,2,3}};
		System.out.println(array5[2][1]);
		

	}

}
