package javaStudy;

import java.util.Calendar;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch 문에 사용되는 키워드: switch, case, default, break
		// case는 맞는 true부터 모두 출력 (특정 케이스 부터 모두 실행시키고 싶을 때 사용)
		// 따라서 true case만 출력하려면 break 를 사용한다.
		//jdk7이상부터 스위치구문에 정수 말고 다른 값도 넣을 수 있게 됨
		int value = 4;
		
		switch(value){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("그 외 다른 숫자");
			break;
		}
		
		String str ="B";
		switch(str){
		case "A":
			System.out.println(str);
			break;
		case "B" :
			System.out.println(str);
			break;
		}
		
		/*
		 * 다음 코드와 같이 같은 동작을 하는 여러개의 case를 묶어서 한번에 처리하고, 
		 * 그 뒤에 break를 한 번만 적어주면 더 편리하게 switch문을 이용할 수 있습니다.
		 * 실행을 해서 결과를 확인해 보세요.
		 * */
		 //month에는 현재 월이 들어 있습니다.
	    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
	    String season = "";
	    
	    //다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
	    switch(month){
	      case 1:
	      case 2:
	      case 12:
	        season = "겨울";
	        break;
	      case 3:
	      case 4:
	      case 5:
	        season = "봄";
	        break;
	      case 6:
	      case 7:
	      case 8:
	        season = "여름";
	        break;
	      case 9:
	      case 10:
	      case 11:
	        season = "가을";
	        break;        
	        
	    }

	    System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
	}

}
