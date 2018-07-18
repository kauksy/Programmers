package quiz;

import java.util.ArrayList;
import java.util.List;

public class TiTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int[] value = new int[] { 1, 2, 3 };
		    List<Integer> numList = getNumList(value);

		    System.out.println(numList);
		    assertEquals(new Integer(1), numList.get(0));
		    assertEquals(new Integer(2), numList.get(1));
		    assertEquals(new Integer(3), numList.get(2));
		    assertEquals(3, numList.size());
	}

		/**
		 * int array를 Integer ArrayList로 변환
		 *  
		 */
		private static List<Integer> getNumList(int[] value) {
		    
			List<Integer> makeList = new ArrayList<Integer>();
			int newInteger = 0 ;

			for (int i=0;  i< value.length; i++)
			{
				newInteger = value[i];
				makeList.add(newInteger);
			}

			return makeList;

		}
	

}
