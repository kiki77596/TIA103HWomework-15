package HomeWorkEx;

public class InkBrush extends Pen  {

	public InkBrush(String brand,int i)
	{
		super(brand,i);
	}
	@Override
	public void SetBrand(String brand) {
		m_Brand = brand;
	}

	@Override
	public void SetPrice(int price) {
		m_price = (int)((int)price*0.9);
	}

	@Override
	public String GetBrand() {
		return m_Brand;
	}

	@Override
	public int GetPrice() {
		return m_price;
	}
	@Override
	public void write()
	{
		System.out.println("沾墨汁再寫");
	}
}
