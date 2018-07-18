package quiz;

import java.util.ArrayList;
import java.util.List;

public class TiTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Q1. 배열 오른차순 소팅
		 *
		 * 주어진 가격정보의 배열에서 찾고자 하는 가격의 배열인덱스를 반환하는 함수를 구현하세요. 시간복잡도가 최상인 방법 (실행시간이
		 * 가장 낮은 방법) 으로 구현하세요. 단 Java에서 기본으로 제공되는 Util 함수를 사용하지 않고 직접 구현합니다.
		 *
		 * 단 아래의 조건을 가정합니다. 숫자배열은 오름차순으로 정렬되어 있음
		 * 
		 * ex> {1000,2000,3000,4000,....4000000}
		 */

		int priceCount = 4000;

		// 가격정보 배열
		int[] priceArray = new int[priceCount];
		for (int priceArrayIdx = 1; priceArrayIdx < priceCount; priceArrayIdx++) {
			priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
		}

		System.out.println(priceArray);
		// System.out.println("가격의 배열인덱스 : "
		 int answer = getSearchPriceArrayIntex(priceArray, 690000);
		 System.out.println(answer);

	}

	// priceArray라는 int형 배열에서 SearchPrice의 금액을 찾는다.
	public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {

		
		int n = searchPrice/1000;
		System.out.println(n);
		return n-1;

		// 이곳에 해당하는 코드를 작성하시요
		// 1. searchPrice를 10으로 나누고 자릿수를 알아냄 (자릿수: j)
		// 2. 각 배열의 값들의 자릿수가 j와 동일한 것을 찾음 (Map1을 만들어서 인덱스 값을 키로, 배열의 값을 Value로
		// 저장)
		// 3. 2에서 구한 결과에서 첫번째 숫자가 searchPrice와 동일한 것을 찾음 (Map2을 만들어서 인덱스 값을 키로,
		// 배열의 값을 Value로 저장)
		// 4. Map1을 삭제
		// 5. 3에서 구한 결과에서 두번째 숫자가 SearchPrice와 동일한 것을 찾고 Map1에 저장 (인덱스 값을 키로,
		// 배열의 값을 Value로 저장)
		// ...반복
		// 6. 마지막 자릿수까지 체크하고 Map의 키값을 리턴

	}
}






