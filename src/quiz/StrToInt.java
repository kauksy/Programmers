package quiz;

/**
 * ���ڿ��� ������ �ٲٱ�
 * 
 * ���� ����
 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 *
 * ���� ����
 * s�� ���̴� 1 �̻� 10,000�����Դϴ�.
 * s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
 * s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
 * s�� 0���� �������� �ʽ��ϴ�.
 * 
 * ����� ��
 * ������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
 * str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * 
 * **/

public class StrToInt {

    public int getStrToInt(String str) {

        return Integer.parseInt(str);
    }
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
