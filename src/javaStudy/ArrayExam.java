package javaStudy;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1���� �迭*/
		// �迭�� ������ �ϳ��ε� ���� ������ => ������ ����Ÿ
		// �迭�� ó�� ������ �� ������� ũ�Ⱑ ������ �ʴ´�.
		int [] array1 = new int[100];
		
		// index: ������� ���� ���̳�?
		array1[0] = 50;
		array1[10] = 100;
		
		// �迭�� ����� �ʱ�ȭ ���ÿ� �ϱ� 
		int [] array2 = new int[]{1, 2, 3, 4};
		int [] array3 = {1,2,3,4};
		
		// �迭���� ��������
		System.out.println(array3[0]);
		int value = array3[2];
		System.out.println(value);

	}

}
