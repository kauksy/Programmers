package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 조건문: 어떤 문장은 수행하고 싶고, 어떤 문장은 수행하고 싶지 않을때 (제어)
		 * if/ switch
		 * */
		
		int x = 50;
		int y = 60;
//		
//		if(x<y)
//		{
//			System.out.println("x<y이다.");
//			System.out.println("test");
//		}
//		if(x==y)
//		{
//			System.out.println("x=y이다1.");
//		}
//		if(x==y)
//			System.out.println("x=y이다2.");// {괄호 없으면 단 한줄만 해당된다.} 
//			System.out.println("test");
		
		if(x==y){
			System.out.println("x=y 이다.3");
			
		}else{
			System.out.println("x와 y는 다르다.");;
		}
		
		if(x==y){
			System.out.println("x=y 이다.3");
			
		}else if(x<y){
			System.out.println("x는 y보다 작다.");
		}
		else{
			System.out.println("x와 y는 다르다.");;
		}
			
		// else if(조건)은 계속 사용 할 수 있지만 가급적 적게 사용한다.
	}

}
