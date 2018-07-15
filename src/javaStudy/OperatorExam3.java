package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연산자우선순위: 연산자가 먼저 나왔을 때, 어느것을 먼저 연산 할 것인가?
		 * 최우선연산자 ( ., [], () )
		 * 단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)
		 * 산술연산자 ( *,/,%,+,-,shift) < 
		 * 시프트연산자 ( >>,<<,>>> ) >
		 * 비교연산자 ( >,<,>=,<=,==,!= ) // 비교연산자는 논리연산자보다 우선 적용된다
		 * 비트연산자 ( &,|,,~ )
		 * 논리연산자 (&& , || , !) => and, or (and연산자가 or연산자보다 우선순위가 높음)
		 * 삼항연산자 (조건식) ? :
		 * 대입연산자 =,*=,/=,%=,+=,-=
		 * 
		 * */
		
		int a = 5;
	    int b = 10;
	    int c = 5;
	    System.out.println(  (a - b) * c );
	    System.out.println(  a - b * c );
	    System.out.println( a > 5 && b>5 ); // 비교연산자 논리연산자 비교연산자 1. a>5 ? 2. b>5? 3. 1&&2?
	    
	    int aa = 5; 
        System.out.println(++aa - 5); // ++a가 먼저 수행되고 -5가 수행됨 (전위연산자)
        System.out.println(aa++ - 5); // ++a가 먼저 수행되고 -5가 수행됨 (후위연산자 = 먼저 다른연산이 진행되고 그다음 증감시킴, 증감을 하기전에 연산을 하고 증감)
	}

}
