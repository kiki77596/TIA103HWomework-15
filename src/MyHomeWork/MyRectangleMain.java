package MyHomeWork;

public class MyRectangleMain {

	public static void main(String[] args) {
		
		MyRctangle r  = new MyRctangle();
		r.Setdepth(20);
		r.SetWidth(10);
		MyRctangle g  = new MyRctangle(10,20);
		System.out.println(r.GetArea());
		System.out.println(g.GetArea());
	}

}
