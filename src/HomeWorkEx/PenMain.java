package HomeWorkEx;

import java.util.Vector;

public class PenMain {

	public static void main(String[] args) {
		
		Vector<Pen> ar = new Vector<Pen>();
		ar.add(new Pencil("Pencil",100));
		ar.add(new InkBrush("InkBrush",90));
		ar.forEach(p->{
			System.out.println("品牌:" + p.GetBrand());
			System.out.println("售價:" + p.GetPrice());
			p.write();
			});
	}
}
