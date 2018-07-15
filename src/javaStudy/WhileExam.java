package javaStudy;

public class WhileExam {

	/*
	 * 반복문 (while, do~while, for)
	 * 1. While: 조건문의 실행 결과가 true일 때 까지 반복
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =0;
//		
//		while(i<10){
//			
//			System.out.println("While문 안에 i:" + i);
//			// 하기 조건이 없으면 무한 루프를 돌게 됨			
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
