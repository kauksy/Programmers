package quiz;

/**
 * ¦���� Ȧ��
 * 
 * ���� ����
 * ���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
 * 
 * ���� ����
 * num�� int ������ �����Դϴ�.
 * 0�� ¦���Դϴ�.
 * 
 * ����� ��
 * num/	return
 * 3/	Odd
 * 4/	Even
 * 
 * **/


public class EvenOrOdd {
	
	String evenOrOdd(int num) {
		String result = "Odd";
		if (num % 2 == 0)
			result = "Even";
		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
		System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
	}
}
