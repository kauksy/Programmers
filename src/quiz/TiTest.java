package quiz;

import java.util.ArrayList;
import java.util.List;

public class TiTest {

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

		// System.out.println("������ �迭�ε��� : "
		// getSearchPriceArrayIntex(priceArray, 690000));

		System.out.println(priceArray);
	}

	// priceArray��� int�� �迭���� SearchPrice�� �ݾ��� ã�´�.
	public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {

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

	/**
	 * Q2.. Long���� List<Integer>�� ��ȯ
	 * 
	 * 	getNumList �Լ��� �ۼ��ϼ���
	 * (��, Stream ����� �Ұ��� �մϴ�.)
	 **/

	
	public void testName() throws Exception {
	    int[] value = new int[] { 1, 2, 3 };
	    List<Integer> numList = getNumList(value);

	    assertEquals(new Integer(1), numList.get(0));
	    assertEquals(new Integer(2), numList.get(1));
	    assertEquals(new Integer(3), numList.get(2));
	    assertEquals(3, numList.size());
	}

	/**
	 * int array�� Integer ArrayList�� ��ȯ
	 * int iInt = 10;
		Integer iInteger = new Integer(iInt);
	 *  
	 */
	private List<Integer> getNumList(int[] value) {
	    
		List<Integer> makeList = new ArrayList<Integer>();
		int newInteger = 0 ;

		for (int i=0;  i< value.length; i++)
		{
			newInteger = value[i];
			makeList.add(newInteger);
		}

		return makeList;

	}

}






