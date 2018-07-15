package javaStudy;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50000;
		long y = x;
		// x -> y로 변경되는 형변환이 일어남 => 묵시적 형변환
		
		long x2 = 5;
//		int y2 = x2; 컴파일러가 결정할 수 없어 프로그래머가 형변환을 해준다
		int y2 =  (int) x2; //=> 강제 형변환

	}

}
