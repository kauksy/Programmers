package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����: �����͸� ó���Ͽ� ����� ����
		 * ������: ���꿡 ���Ǵ� ǥ�ó� ��ȣ(-,+,��*...)
		 * �ǿ�����: ���� ����� �Ǵ� ������(���ͷ�, ����)
		 * �����: �����ڿ� �ǿ��縦 �̿��Ͽ� ������ ������ ���
		 * 
		 * ������: ��ȣ������ (+, -)=> ���׿�����
		 * ���������: (+, -, *, /, %(������ ���� ���ϴ� ������, ��ⷯ������))
		 * ���������� (++,--)=> ���׿�����
		 * 
		 * */
		
		int i1 =-5; // -�� ������, 5�� �ǿ�����
		int i2 = +i1; // + �ٿ����� ��ȣ �״�� ����
		int i3 =-i1; // -�տ� - �ٿ��� +�� ��ȯ
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1 �� ���� => *1�� ���ϰ� ����
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; //i3 = i3+1 �� ���� //* �����ϰ� 1�� ����
		System.out.println(i5);
		System.out.println(i3);
		
		
		int i=5;
		int j =2;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); // ���� ������ ���� = ���� ����, ���� �ϳ��� double�̸� ���� �Ǽ��� ���´�.
		System.out.println(i/(double)j); //ĳ���� ��ȯ
		System.out.println((double)i/j); //ĳ���� ��ȯ 
		System.out.println(i%j);


	}

}
