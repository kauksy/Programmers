package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���ǹ�: � ������ �����ϰ� �Ͱ�, � ������ �����ϰ� ���� ������ (����)
		 * if/ switch
		 * */
		
		int x = 50;
		int y = 60;
//		
//		if(x<y)
//		{
//			System.out.println("x<y�̴�.");
//			System.out.println("test");
//		}
//		if(x==y)
//		{
//			System.out.println("x=y�̴�1.");
//		}
//		if(x==y)
//			System.out.println("x=y�̴�2.");// {��ȣ ������ �� ���ٸ� �ش�ȴ�.} 
//			System.out.println("test");
		
		if(x==y){
			System.out.println("x=y �̴�.3");
			
		}else{
			System.out.println("x�� y�� �ٸ���.");;
		}
		
		if(x==y){
			System.out.println("x=y �̴�.3");
			
		}else if(x<y){
			System.out.println("x�� y���� �۴�.");
		}
		else{
			System.out.println("x�� y�� �ٸ���.");;
		}
			
		// else if(����)�� ��� ��� �� �� ������ ������ ���� ����Ѵ�.
	}

}
