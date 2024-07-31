package MyHomeWork;

public class Calculator extends CalException{
	public int pwoerXY(int x,int y) throws CalException
	{
		String s = "123456789";
		if(x==0||y==0)
			throw new CalException("x或y值為0");
		else if (y<0)
			throw new CalException("次方為負值");	
		return x*y;
	}
	
}
