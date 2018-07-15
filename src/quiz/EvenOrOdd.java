package quiz;

/**
 * 짝수와 홀수
 * 
 * 문제 설명
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 * 
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 * 
 * 입출력 예
 * num/	return
 * 3/	Odd
 * 4/	Even
 * 
 * **/


public class EvenOrOdd {
	
	String evenOrOdd(int num) {
		String result = "Odd";
		if (num % 2 == 0)
			result = "Even";
		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
	}
}
