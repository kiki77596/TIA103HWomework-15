package hw1;

import static java.lang.System.out;
interface Test
{
	void Prin();
}
public class HomeWork_1 {
	
	public static void Printer(String s){
		System.out.println(s);
	}
	public static void main(String[] args ) 
	{
		
		{
			int a = 12,b = 6;
			Printer("和:"+ a);
			Printer("積:"+(a*b));
		}
		
//		*************************************************
		
		{
			Runnable Ans = new Runnable(){
				@Override
				public void run(){
					int TotalSec = 256559,Min = 60,Sec = 60,Hour = 24;
					int Days = TotalSec / ( Sec * Min * Hour);
					out.print(Days + "天");
					int RemainingSec = TotalSec % ( Hour * Min * Sec );
					out.print( RemainingSec / (Min*Sec) + "時");
					out.print( RemainingSec %( Sec * Min) / Min + "分");
					out.print( RemainingSec % Sec + "秒\n");
				}
			};
			Ans.run();
		}
//		*************************************************	
		
		{
			final double PI = 3.1415d,Raidus = 5;
			Printer("圓面積:" + (Math.pow(Raidus,2)*PI));
			Printer("圓周長:" + (Raidus*2*PI));
		}
		
		
//		*************************************************
		
		{
			double P = 1500000,n = 10,i  = 0.02; //本金 期限 利率
			
			Printer("總金額為:"+(int)(P*Math.pow(1.0+i, n)));
		}
		
//		*************************************************		
		
		
		// int a  = 5 , b  = 5;
		// System.out.println(a+b)
		//輸出結果為(int)10 原因: a,b都是int型故輸出為(int)10
		
		//int a = 5; char b = '5';
		//System.out.println(a+b);
		//輸出結果為(int)65 原因: int+char char會依照Unicde轉換為對印字符的數字後再相加
		
		//int a = 5;String b = "5";
		//System.out.print(a+b);
		//輸出結果為(String)55 原因: java特性 String+非String所輸出的結果為字串	
	}
	
}
