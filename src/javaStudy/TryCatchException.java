package javaStudy;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			doFor();
			sysout(); // doFor 메서드에서 3이 되면 될 때, Exception 발생하여 sysout 메서드는 수행 안됨
		}
		catch(Exception e)
		{
			System.out.println("Exception: " +e);
		}

	}
	
	private static void doFor() throws Exception
	{
		for(int i=1; i < 6; i++)
		{
			if(i < 6)
			{
				System.out.println(i+", ");
			}
			if(i == 3)
			{
				throw new Exception();
			}
			
		}
	}
	
	private static void sysout() throws Exception
	{
		for(int i=1; i < 6; i++)
		{
			if(i < 6)
			{
				System.out.println( "sysout 메서드 호출: "+i);
			}
			
		}
	}

}
