package javaStudy;

import java.util.Scanner;

public class DoWhileExam {

	/*
	 * 무조건 한번은 실행되게 하는 do while
	 * 어쩄든 한번은 입력 받고 싶을 떄 사용
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 0;
		// 키보드로부터 값을 입력받는 스캐너 클래스
		Scanner scan = new Scanner(System.in);
		do{
			// 반복할 문장들
			value = scan.nextInt();
			System.out.println("입력받은 값: "+value);
		}
		// 10이 아닌 값이 들어오면 계속 반복(10이 들어오면 종료됨)
		while(value !=10);
		System.out.println("end");


	}

}
