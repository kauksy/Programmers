package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	/*
	 * ������ �ѹ��� ����ǰ� �ϴ� do while
	 * ��� �ѹ��� �Է� �ް� ���� �� ���
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 0;
		// Ű����κ��� ���� �Է¹޴� ��ĳ�� Ŭ����
		Scanner scan = new Scanner(System.in);
		do{
			// �ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է¹��� ��: "+value);
		}
		// 10�� �ƴ� ���� ������ ��� �ݺ�(10�� ������ �����)
		while(value !=10);
		System.out.println("end");


	}

}
