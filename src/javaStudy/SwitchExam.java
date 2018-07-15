package javaStudy;

import java.util.Calendar;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch ���� ���Ǵ� Ű����: switch, case, default, break
		// case�� �´� true���� ��� ��� (Ư�� ���̽� ���� ��� �����Ű�� ���� �� ���)
		// ���� true case�� ����Ϸ��� break �� ����Ѵ�.
		//jdk7�̻���� ����ġ������ ���� ���� �ٸ� ���� ���� �� �ְ� ��
		int value = 4;
		
		switch(value){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("�� �� �ٸ� ����");
			break;
		}
		
		String str ="B";
		switch(str){
		case "A":
			System.out.println(str);
			break;
		case "B" :
			System.out.println(str);
			break;
		}
		
		/*
		 * ���� �ڵ�� ���� ���� ������ �ϴ� �������� case�� ��� �ѹ��� ó���ϰ�, 
		 * �� �ڿ� break�� �� ���� �����ָ� �� ���ϰ� switch���� �̿��� �� �ֽ��ϴ�.
		 * ������ �ؼ� ����� Ȯ���� ������.
		 * */
		 //month���� ���� ���� ��� �ֽ��ϴ�.
	    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
	    String season = "";
	    
	    //������ ���� case���� �ѹ��� ����ϸ� �� ª�� �ڵ带 © �� �ֽ��ϴ�.
	    switch(month){
	      case 1:
	      case 2:
	      case 12:
	        season = "�ܿ�";
	        break;
	      case 3:
	      case 4:
	      case 5:
	        season = "��";
	        break;
	      case 6:
	      case 7:
	      case 8:
	        season = "����";
	        break;
	      case 9:
	      case 10:
	      case 11:
	        season = "����";
	        break;        
	        
	    }

	    System.out.println("������ "+ month +"���̰�, "+ season +"�Դϴ�.");
	}

}
