package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� �ε����� ���ؼ� �����Ѵ�.

		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println("�迭�� ����: " + iarray.length);
		
		// iarray.length�� ũ�⸦ ���
		for(int i = 0; i < iarray.length; i++){
			// 1~ 100���� �迭 ���� ä�� �� ����
			iarray[i] =i+1; 
		}
		
		// ������ scope: ������ ����� �� �ִ� ������� 
		// (��: for�� �ȿ��� ��� �� i��, for�� �ȿ����� ��밡��)
		int sum = 0;
		for(int i = 0 ; i < iarray.length; i++){
			sum = sum+iarray[i];
		}
		System.out.println("�迭 �� ��Ҹ� ��� ����: " + sum);

	}

}
