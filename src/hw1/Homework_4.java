package hw1;
import java.util.*;
import java.math.*;
import java.time.*;
public class Homework_4 {

class BaseFormat
{
	protected void Title(String ti){System.out.println("Test " + ti);}
	protected void End(){System.out.println("********************************");}
	protected void Ans() {
		
	}
	
}	
class Test_1 extends BaseFormat
{
	@Override
	public void Ans()
	{
		super.Title("1");
		int[] array = {29,100,39,41,50,8,66,77,95,15};
		Arrays.sort(array);
	
		float avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i];
			if( i ==array.length-1)
			{
				avg /= array.length; 
			}
		}
		System.out.println("平均為 " + avg);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>avg)
			{
				System.out.print(array[i]+"\t");
			}
		}
		System.out.println();
		super.End();
	}
}
class Test_2 extends BaseFormat
{
	@Override
	public void Ans()
	{
		super.Title("2");
		String st = "Hello World";
		String re_st = new StringBuilder(st).reverse().toString();
		System.out.println(re_st);
		super.End();
	}
}
class Test_3 extends BaseFormat
{
	@Override
	public void Ans() 
	{
		super.Title("3");
		List<String> st = Arrays.asList("mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune");
		 int amount = st.stream().mapToInt(s -> 
		 		  ((s.contains("a") ? 1 : 0)
                 + (s.contains("e") ? 1 : 0))
		 		 + (s.contains("i") ? 1 : 0)
				 + (s.contains("o") ? 1 : 0)
				 + (s.contains("u") ? 1 : 0)).sum();
		System.out.println(amount);
		super.End();
	}
}
class Test_4 extends BaseFormat
{
	@Override
	public void Ans()
	{
		super.Title("4");
		System.out.println("輸入欲借金額:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//sc.close();
		Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
		pair.put(25,2500);
		pair.put(32,800);
		pair.put(8,500);
		pair.put(19,1000);
		pair.put(27,1200);
		System.out.println("員工編號:");
		
		for (Map.Entry<Integer, Integer> entry : pair.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(val>=input)
				System.out.print(key+" ");
		}
		System.out.println("共"+pair.size()+"人");
		System.out.println();
		super.End();
	}
}
class Test_5 extends BaseFormat
{
	@Override
	public void Ans()
	{
		super.Title("5");
				
	        // 讀取輸入
	    System.out.print("請輸入年月日 (yyyy mm dd): ");
	    Scanner scanner = new Scanner(System.in);
	    int year = scanner.nextInt();
	    int month = scanner.nextInt();
	    int day = scanner.nextInt();
	    scanner.close();
	        // 創建 LocalDate 對象
	    LocalDate date = LocalDate.of(year, month, day);

	        // 計算並顯示該日期是該年的第幾天
	    int dayOfYear = date.getDayOfYear();
	    System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");

	        
		super.End();
	}
}
class Test_6 extends BaseFormat
{
	private int[][] getExamScoer()
	{
		return new int [][] {
			 {10,37,100,77,98,90}
			,{35,75,70,95,70,80}
			,{40,77,79,70,89,100}
			,{100,89,90,89,90,75}
			,{90,64,75,60,75,50}
			,{85,75,70,75,90,20}
			,{75,70,79,85,89,99}
			,{70,95,90,89,90,75}
			};
	}
	
	@Override	
	public void Ans()
	{

		super.Title("6");
		int[][] exam_score = getExamScoer();
		Map<Integer,Integer> highr_score_result = new LinkedHashMap<Integer, Integer>();
		for (int student = 0; student < exam_score.length; student++) {
			
			 int[] ar = exam_score[student];
			 Arrays.sort(ar);
			 highr_score_result.put(student+1,ar[ar.length-1]);
		}
		System.out.println(highr_score_result);
		super.End();
	}
}
	public static void main(String[] args) {
		
		Homework_4 func = new Homework_4();
		Vector<Homework_4.BaseFormat> AnsAry = new Vector<Homework_4.BaseFormat>();
	
//  ********************************************
		AnsAry.add(func.new Test_1());
		AnsAry.add(func.new Test_2());
		AnsAry.add(func.new Test_3());
		AnsAry.add(func.new Test_4());
		AnsAry.add(func.new Test_5());
		AnsAry.add(func.new Test_6());
		
		for (int i = 0; i < AnsAry.size(); i++) {
			AnsAry.get(i).Ans();
		}
		
//  ********************************************		
	}

}
