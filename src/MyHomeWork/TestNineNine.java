package MyHomeWork;

import static java.lang.System.out;
public class TestNineNine {

	public static void main(String[] args) {
		
		int n = 1,b = 1;
		while(n<=9)
		{
			out.print(n + " * " + b + " = " + (b*n) + "\t\n");
			b++;
			
			if(b>=10)
			{
				b = 1;
				n++;
			}
		}
	}
}
