package quiz;

/**
 * ���ڼ��ڼ��ڼ��ڼ��ڼ�?
 * 
 * ���� ����
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 * 
 * ���� ����
 * n�� ���� 10,000������ �ڿ����Դϴ�.
 * 
 * ����� ��
 * n/ return
 * 3/ ���ڼ�
 * 4/ ���ڼ���
 * 
 * **/
public class WaterMelon {
	 public String watermelon(int n){
	        String sMelon = "";

	        for(int i = 0; i < n; i++){
	            if((i % 2) == 0)
	                sMelon += "��";
	            else
	                sMelon += "��";
	        }
	        return sMelon;
	    }

	    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	    public static void  main(String[] args){
	        WaterMelon wm = new WaterMelon();
	        System.out.println("n�� 3�� ���: " + wm.watermelon(3));
	        System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	    }

}
