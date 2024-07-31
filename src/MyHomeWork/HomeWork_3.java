package MyHomeWork;


import java.util.Scanner;
import java.util.Vector;
import static java.lang.System.out;

class Test_Base
{
	Scanner sc;
	Test_Base(String No)
	{
		out.println("Test "+No);
	}
	void GetScanner() {sc =  new Scanner(System.in);}
	void Sper() {out.println("-----------------------------------------------");}
}

class Test_1 extends Test_Base
{
	
	Vector<Integer> ar;
	Test_1()
	{
		super("1");
		
		ar = new Vector<>();
		out.println("輸入3個數字表示三角形的各邊長  (輸入- 表示結束輸入)");
		while(true){
			String input = sc.next();
			if (input.equals("-")) {
				break; // 跳出迴圈
			}
               int number = Integer.parseInt(input);
			ar.add(number);
		}
		
	}
	void isTriangle(){
		int a = ar.get(0),b = ar.get(1),c = ar.get(2);
		if(!(a+b>c && a+c >b && b+c>a))
			out.println("不是三角形");
		else if(a == b && b == c )
			out.println("正三角形");
		else if(a==b || a == c|| c==a)
			out.println("等腰三角形");
		
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))
			out.println("直角三角形");
		super.Sper();
	}
}

class Test_2 extends Test_Base
{	
	Test_2()
	{
		super("2");
	}
	private void isBiggerSmaller(int trager, int input)
	{
		if(input>trager)
			out.print("，大於正確答案");
		else
			out.print("，小於正確答案");
	}
	void MiniGame()
	{
		int Ans = (int)(Math.random()*100)+1;
		while(true)
		{	
			int input = sc.nextInt();
			if(input == Ans)
			{
				out.println("猜對了");
				break;
			}
			else
			{
				out.println("猜錯了");	
				isBiggerSmaller(Ans,input);
			}
		}
		sc.close();
		super.Sper();
	}
}

class Test_3 extends Test_Base
{
	Test_3()
	{
		super("3");
	}
	void Lotto()
	{
		out.println("阿文.... 請輸入你討厭的數字");
		GetScanner();
		String st = sc.next();
		int count = 0;
		for(int i = 0;i<49;i++)
		{
			if(String.valueOf(i).contains(st))
				continue;
			out.print(i + "\t");
			count++;
			if(i%5==0)
				out.print("\n");
			
		}
		out.println("\n總共有" + count + "數字可選");
		super.Sper();
	}
}

public class HomeWork_3 {

	public static void main(String[] args) {
		
//	***************************************
		
		//Test_1 test_1 = new Test_1();
		//test_1.isTriangle();
	
//	***************************************
		
		//Test_2 test_2 = new Test_2();
		//test_2.MiniGame();
		
//	***************************************
		
		//Test_3 test_3 = new Test_3();
		//test_3.Lotto();
		
//	***************************************
		//作業已完成
		
	}
}