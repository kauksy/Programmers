package quiz;


/**
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * */
public class FindCharater {

	public static void main(String[] args) {

		String print = solution("soltion");
		System.out.println(print);

	}

	public static String solution(String s) {
		
		int beginIndex = s.length()/2;
		int endIndex = beginIndex+1;
		
		if((s.length()%2) == 0)
		{
			System.out.println("짝수");

			System.out.println(s.substring(beginIndex-1, endIndex));
			
			
		}else
		{
			// 홀수면 가운데 글자 반환
			System.out.println("홀수");
			beginIndex = s.length()/2;
			endIndex = beginIndex+1;
			System.out.println(s.substring(beginIndex, endIndex));
			//s.substring(beginIndex, endIndex);
		}
		
		String answer = "";
		return answer;
	}

}