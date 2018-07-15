package javaStudy;

public class OperatorExam6 {

	public static void main(String[] args) {
		// 삼항연상자 : if문의로 풀어 쓸 수 있다.
		int b1 = (5 < 4) ? 50: 40;
		
		System.out.println(b1);
		
		int b2 =0;
		if(5 < 4){
			b2 =50;
		}else{
			b2 =40;
		}
		System.out.println(b2);
	}

}
