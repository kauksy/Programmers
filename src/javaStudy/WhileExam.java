package javaStudy;

public class WhileExam {

	/*
	 * �ݺ��� (while, do~while, for)
	 * 1. While: ���ǹ��� ���� ����� true�� �� ���� �ݺ�
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =0;
//		
//		while(i<10){
//			
//			System.out.println("While�� �ȿ� i:" + i);
//			// �ϱ� ������ ������ ���� ������ ���� ��			
//			// i=i+1;
//			i++;
//		}
		
		int total =0;
		int i =1;
		while(i<=100){
			total = total+1;
			i++;
		}
		System.out.println("total:" + total);
		
	}

}
