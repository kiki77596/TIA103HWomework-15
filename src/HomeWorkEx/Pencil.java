package HomeWorkEx;

public class Pencil extends Pen{

	public Pencil(String string, int i) {
		super(string,i);
	}

	@Override
	public void SetBrand(String brand) {
		m_Brand = brand;
	}

	@Override
	public void SetPrice(int price) {
		m_price = (int)((int)price*0.8);
	}

	@Override
	public String GetBrand() {
		return m_Brand;
	}
	@Override
	public int GetPrice() {
		// TODO Auto-generated method stub
		return m_price;
	}
	@Override
	public void write(){
		System.out.println("削鉛筆在寫");
	}
}
