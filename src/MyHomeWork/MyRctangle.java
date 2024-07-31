package MyHomeWork;

public class MyRctangle {
	private double width;
	private double depth;
	public MyRctangle(){}
	public MyRctangle(int awidth,int adepth)
	{
		width = adepth;
		depth  = adepth;
		
	}
	void SetWidth(double awidth) { width = awidth;}
	void Setdepth(double adepth) { depth = adepth;}
	double GetArea() { return width* depth;}
	
}
