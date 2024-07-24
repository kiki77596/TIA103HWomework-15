package hw1;

import static java.lang.System.out;
import java.util.*;



public class HomeWork_2 {

	void Separate() {
		out.println("************************");
	}
	
	public static void main(String[] args)
	{
		HomeWork_2 func = new HomeWork_2();

//  ****************************************
		func.Separate();
		int ans = 0;
		for (int i = 0; i <= 1000; i += 2) 
		{
			ans += i;
		}
		out.println(ans);
		func.Separate();
//  *****************************************
		{
		int tem = 1;
		for (int i = 0; i < 10; i++) 
		{
			tem += tem * i;
		}
		out.println(tem);
		func.Separate();
		tem = 1;
//  ****************************************
		int index = 1;
		while (index < 10) 
		{
			tem += index * tem;
			index++;
		}
		out.println(tem);
		func.Separate();
		}
//  ****************************************
		Vector<Integer> ar = new Vector<>();
		String str;
		for(int i = 0;i<49;i++)
		{
			str = String.valueOf(i);
			if(str.contains(String.valueOf(4)))
				continue;
			ar.add(i);
		}
		out.print("可選數字為:"+ ar);
		out.println();
		out.print("總共:"+ ar.size()+"個可選");
		out.println();
		func.Separate();
//  ****************************************
		for(int i = 10;i>0;i--)
		{
			for(int j = 1;j<=i;j++)
			{
				out.print(j+" ");
			}
			out.println();
		}
		
		func.Separate();
//  ****************************************
		char index = 'A';
		while(index<='F')
		{
			for(int k = 0;k<=index-'A';k++)
			{
				out.print(index);
			}
			index++;
			out.println();
		}
		func.Separate();
//  ****************************************
		int[][] sl = new int[4][];
		sl[0] = new int [5];
		sl[1] = new int[4];
		out.println(sl[1].length);
	}
}
