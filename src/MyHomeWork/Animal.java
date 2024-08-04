package MyHomeWork;

import java.io.Serializable;

public class Animal implements Serializable{
	
	private static final long serialVersionUID = 99466554L;
	
	protected String m_Name;
	protected String m_AnimalType;
	public Animal(String aname,String aanimalType) {
		m_Name = aname;
		m_AnimalType = aanimalType;
	}
	protected void speak() {
		System.out.println("This is " + m_AnimalType +" "+ m_Name + " speaking.");
	}
}
