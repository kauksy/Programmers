package quiz;

import java.util.ArrayList;
import java.util.List;

public class TiTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Q1. �迭 �������� ����
		 *
		 * �־��� ���������� �迭���� ã���� �ϴ� ������ �迭�ε����� ��ȯ�ϴ� �Լ��� �����ϼ���. �ð����⵵�� �ֻ��� ��� (����ð���
		 * ���� ���� ���) ���� �����ϼ���. �� Java���� �⺻���� �����Ǵ� Util �Լ��� ������� �ʰ� ���� �����մϴ�.
		 *
		 * �� �Ʒ��� ������ �����մϴ�. ���ڹ迭�� ������������ ���ĵǾ� ����
		 * 
		 * ex> {1000,2000,3000,4000,....4000000}
		 */

		int priceCount = 4000;

		// �������� �迭
		int[] priceArray = new int[priceCount];
		for (int priceArrayIdx = 1; priceArrayIdx < priceCount; priceArrayIdx++) {
			priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
		}

		System.out.println(priceArray);
		// System.out.println("������ �迭�ε��� : "
		 int answer = getSearchPriceArrayIntex(priceArray, 690000);
		 System.out.println(answer);

	}

	// priceArray��� int�� �迭���� SearchPrice�� �ݾ��� ã�´�.
	public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {

		
		int n = searchPrice/1000;
		System.out.println(n);
		return n-1;

		// �̰��� �ش��ϴ� �ڵ带 �ۼ��Ͻÿ�
		// 1. searchPrice�� 10���� ������ �ڸ����� �˾Ƴ� (�ڸ���: j)
		// 2. �� �迭�� ������ �ڸ����� j�� ������ ���� ã�� (Map1�� ���� �ε��� ���� Ű��, �迭�� ���� Value��
		// ����)
		// 3. 2���� ���� ������� ù��° ���ڰ� searchPrice�� ������ ���� ã�� (Map2�� ���� �ε��� ���� Ű��,
		// �迭�� ���� Value�� ����)
		// 4. Map1�� ����
		// 5. 3���� ���� ������� �ι�° ���ڰ� SearchPrice�� ������ ���� ã�� Map1�� ���� (�ε��� ���� Ű��,
		// �迭�� ���� Value�� ����)
		// ...�ݺ�
		// 6. ������ �ڸ������� üũ�ϰ� Map�� Ű���� ����

	}
}






