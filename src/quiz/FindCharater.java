package quiz;


/**
 * ���� ����
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * 
 * s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 * */
public class FindCharater {

	public static void main(String[] args) {

		String print = solution("soltion");
		System.out.println(print);

	}

	public static String solution(String s) {
		
		int beginIndex = s.length()/2;
		int endIndex = beginIndex+1;
		
		if((s.length()%2) == 0)
		{
			System.out.println("¦��");

			System.out.println(s.substring(beginIndex-1, endIndex));
			
			
		}else
		{
			// Ȧ���� ��� ���� ��ȯ
			System.out.println("Ȧ��");
			beginIndex = s.length()/2;
			endIndex = beginIndex+1;
			System.out.println(s.substring(beginIndex, endIndex));
			//s.substring(beginIndex, endIndex);
		}
		
		String answer = "";
		return answer;
	}

}