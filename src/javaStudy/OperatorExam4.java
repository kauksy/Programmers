package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �񱳿�����
		 * ����(==), �ٸ���, ũ��/�۴�, ũ�ų�����, �۰ų� ����
		 * �񱳿������� ���� �Ҹ����̴�.
		 * */
		int i=10; // �ܼ� ���Կ����� (=)
		int j= 10;
		
		System.out.println(i==j); //true
		System.out.println(i!=j); //false
		System.out.println(i<j); //false
		System.out.println(i<=j); //true
		System.out.println(i>j); //false
		System.out.println(i>=j); //true
		
		boolean c = (i>j); // ��ȣ ���ĵ� �Ǳ� ��
		System.out.println(c);
		// ���մ��� ������
		i +=10; // i=i+10�� ���� 
		System.out.println(i);
		System.out.println(i-=5); // 20�� 5�� ���� �ٽ� i�� ����

	}
}
