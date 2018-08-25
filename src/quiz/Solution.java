package quiz;


import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SOO
 * ���� ����
 *	2016�� 1�� 1���� �ݿ����Դϴ�.
 * 2016�� a�� b���� ���� �����ϱ��?  
 * �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
 * 
 * ���� ���� :2016���� ����/ 2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
 */

class Solution {
	public void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(a +"�� " +b+ "�� " + solution(a, b) + "����");
	}

	public String solution(int a, int b) {

		Map<Integer, Integer> mothsMap = makeMonthMap();
		String yoil[] = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		String answer = "";
		if (a == 1) {
			
			System.out.println("D-days: "+ b);
			System.out.println("D-days % 7 = "+ b%7);
			answer = yoil[((b-1) % 7)];
		} else {
			int alldays = 0;
			for (int c = 1; c < a; c++) {

				alldays += mothsMap.get(c);
			}
			alldays +=b;
			System.out.println("D-days: "+ alldays);
			System.out.println("D-days % 7 = "+ alldays%7 );
			answer = yoil[((alldays-1) % 7)];
		}
		return answer;
	}

	private Map<Integer, Integer> makeMonthMap() {
		// 1. ���� �����ϴ� �� �����
		/*
		 * �� ���� ��ĥ���� ����ϱ� 28��: 2��/ 31��: 1,3,5,7,8,10,12��/ 30��: 4,6,9,11��
		 */
		Map<Integer, Integer> moths = new HashMap<Integer, Integer>();
		int thiryOneDays[] = { 1, 3, 5, 7, 8, 10, 12 };
		int thirtyDays[] = { 4, 6, 9, 11 };

		moths.put(2, 29);
		for (int i = 0; i< thirtyDays.length; i++) {
			
				moths.put(thirtyDays[i], 30);
		}
		for (int i = 0; i< thiryOneDays.length; i++) {
			
			moths.put(thiryOneDays[i], 31);
		}
					
		return moths;
	}
}