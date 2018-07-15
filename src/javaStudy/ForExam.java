package javaStudy;

public class ForExam {

	/**
	 * for반복문은 변수초기화, 조건식, 증감식이 한줄에 모두 있다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			// //1 ~100까지의 합
			// total = total+i;

			// 짝수들의 합
//			if (i % 2 != 0) {
				// continue는 만나면 다시 위로 올라가서 반복문을 수행
//				continue;
//			}
			total = total + i;
			if(i==50){
				// break는 만난 지점부터 반복문을 빠져나옴
				break;
			}
			
		}
		System.out.println(total);

	}

}
