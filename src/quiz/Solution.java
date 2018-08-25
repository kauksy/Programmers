package quiz;


import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SOO
 * 문제 설명
 *	2016년 1월 1일은 금요일입니다.
 * 2016년 a월 b일은 무슨 요일일까요?  
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
 * 
 * 제한 조건 :2016년은 윤년/ 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 */

class Solution {
	public void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(a +"월 " +b+ "일 " + solution(a, b) + "요일");
	}

	public String solution(int a, int b) {

		Map<Integer, Integer> mothsMap = makeMonthMap();
		String yoil[] = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		String answer = "";
		if (a == 1) {
			
			System.out.println("D-days: "+ b);
			System.out.println("D-days % 7 = "+ b%7);
			answer = yoil[((b-1) % 7)];
		} else {
			int alldays = 0;
			for (int c = 1; c < a; c++) {

				alldays += mothsMap.get(c);
			}
			alldays +=b;
			System.out.println("D-days: "+ alldays);
			System.out.println("D-days % 7 = "+ alldays%7 );
			answer = yoil[((alldays-1) % 7)];
		}
		return answer;
	}

	private Map<Integer, Integer> makeMonthMap() {
		// 1. 월을 제어하는 맵 만들기
		/*
		 * 각 달이 며칠인지 고려하기 28일: 2월/ 31일: 1,3,5,7,8,10,12월/ 30일: 4,6,9,11월
		 */
		Map<Integer, Integer> moths = new HashMap<Integer, Integer>();
		int thiryOneDays[] = { 1, 3, 5, 7, 8, 10, 12 };
		int thirtyDays[] = { 4, 6, 9, 11 };

		moths.put(2, 29);
		for (int i = 0; i< thirtyDays.length; i++) {
			
				moths.put(thirtyDays[i], 30);
		}
		for (int i = 0; i< thiryOneDays.length; i++) {
			
			moths.put(thiryOneDays[i], 31);
		}
					
		return moths;
	}
}