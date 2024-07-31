package MyHomeWork;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int breakFlg = 0;
		while(true)
		{
			try {
				Scanner scx = new Scanner(System.in);
				System.out.println("輸入x值");
				if(!scx.hasNextInt())
					throw new NumberFormatException("輸入格式不正確");
				System.out.println("輸入y值");
				Scanner scy = new Scanner(System.in);
				breakFlg  = cal.pwoerXY(scx.nextInt(), scy.nextInt());
				System.out.println(breakFlg);
				scx.close();
				scy.close();
				if(breakFlg!=0)
					break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}catch (NumberFormatException e) {
					System.out.println(e.getMessage());
			}
		}
	}
}
