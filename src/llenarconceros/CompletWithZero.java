package llenarconceros;

public class CompletWithZero 
{
	private int MAX_NUMBER = 10000;
	
	
	public void run()
	{
		getFilledNumber();
	}
	
	
	private void getFilledNumber()
	{
		StringBuilder sb = null;
		
		for(int currentNumber=0; currentNumber <= MAX_NUMBER; currentNumber++)
		{		
			sb = new StringBuilder();
			int currentLenght = String.valueOf(currentNumber).length();
			
			for(int index=1; index <= ((String.valueOf(MAX_NUMBER).length()) - currentLenght); index ++)
			{
				sb.append("0");
			}
			sb.append(currentNumber);
			
			System.out.println(sb.toString());
		}		
	}

	
	public static void main(String[] args) {
		new CompletWithZero().run();
	}
}
