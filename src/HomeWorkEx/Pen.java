package HomeWorkEx;

public class Pen implements PenFunctionInterface {
	protected String m_Brand;
	protected int m_price;
	public Pen(){}
	public Pen(String brand,int price)
	{
		m_Brand = brand;
		m_price  = price;
		
	}
	void write(){}
	@Override
	public void SetBrand(String brand) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SetPrice(int price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String GetBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int GetPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
