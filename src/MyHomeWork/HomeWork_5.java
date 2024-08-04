package MyHomeWork;

import java.util.*;




public class HomeWork_5 {
	class Test_1 extends C_BaseFormat implements C_TestResult
	{
		private void starSquare(int width,int height)
		{
			for (int i = 0; i < height; i++)
			{
				for (int j = 0; j < width; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		@Override
		public void Ans()
		{
			super.Title("1");
			System.out.println("輸入寬與長:");
			Scanner sc = new Scanner(System.in);
			starSquare(sc.nextInt(), sc.nextInt());
			sc.close();
			super.End();
		}
	}
	class Test_2 extends C_BaseFormat implements C_TestResult,C_MyFunction
	{
		@Override
		public void Ans() 
		{
			super.Title("2");
			var ar =  RandNumber(0,100, 10);
			int amount = 0;
			for (int i = 0; i < ar.size(); i++) 
			{
				amount = ar.size();			
			}
			System.out.print("本次亂數局果為:");
			System.out.print(ar+"\t");
			System.out.println();
			System.out.println("平均為:" + amount/ar.size());
			super.End();
		}
	}
	class Test_3 extends C_BaseFormat implements C_TestResult,C_MyFunction
	{
		private<T extends Comparable<T>> T GetMaxElement(T[][]Matrix)
		{
			T MaxNumber = Matrix[0][0];
			for (int i = 0; i < Matrix.length; i++)
			{
				for (int j = 0; j < Matrix[i].length; j++)
				{
					if(Matrix[i][j].compareTo(MaxNumber)>0)
						MaxNumber = Matrix[i][j];
				}
			}
			
			return MaxNumber;
		}
		@Override
		public void Ans() 
		{
			super.Title("3");
			
			Integer[][] ai = {{1,6,3},{9,5,2}};
			Double[][]  ad = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
			System.out.println(GetMaxElement(ai));
			System.out.println(GetMaxElement(ad));
			
			super.End();
		}
	}
	// Test_4 在MyRectangleMain
	
	class Test_5 extends C_BaseFormat implements C_TestResult,C_MyFunction
	{
		

		char[] getAuthCode() 
		{
			final int MaxAuth = 8;
			char[] aut = new char[8];
			for (int i = 0; i < MaxAuth; i++)
			{
				Vector<Integer> key = RandNumber(0,2,2);
				
				if(key.get(0)==0)
					aut[i] = (char)RandNumber(48,57,1).get(0).intValue();
				else if( key.get(0)==1)
					aut[i] = (char)RandNumber(65,90,1).get(0).intValue();
				else 
					aut[i] = (char)RandNumber(97, 122, 1).get(0).intValue();
			}
			
			
			return aut;
					
		}
		
		@Override
		public void Ans() 
		{
			super.Title("5");
			System.out.println("本次隨機產生驗證碼為");
			
			System.out.println(getAuthCode());
			
			super.End();
		}
	}
	
	public static void main(String[] args) 
	{
		HomeWork_5 func = new HomeWork_5();
		Vector<C_BaseFormat> AnsAry = new Vector<C_BaseFormat>();
		
		AnsAry.add(func.new Test_1());
		AnsAry.add(func.new Test_2());
		AnsAry.add(func.new Test_3());
		AnsAry.add(func.new Test_5());
		
		for (int i = 0; i < AnsAry.size(); i++) {
			AnsAry.get(i).Ans();
		}
	}

}
