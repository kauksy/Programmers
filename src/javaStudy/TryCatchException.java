package javaStudy;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			doFor();
			sysout(); // doFor �޼��忡�� 3�� �Ǹ� �� ��, Exception �߻��Ͽ� sysout �޼���� ���� �ȵ�
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
				System.out.println( "sysout �޼��� ȣ��: "+i);
			}
			
		}
	}

}
