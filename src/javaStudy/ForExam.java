package javaStudy;

public class ForExam {

	/**
	 * for�ݺ����� �����ʱ�ȭ, ���ǽ�, �������� ���ٿ� ��� �ִ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			// //1 ~100������ ��
			// total = total+i;

			// ¦������ ��
//			if (i % 2 != 0) {
				// continue�� ������ �ٽ� ���� �ö󰡼� �ݺ����� ����
//				continue;
//			}
			total = total + i;
			if(i==50){
				// break�� ���� �������� �ݺ����� ��������
				break;
			}
			
		}
		System.out.println(total);

	}

}
