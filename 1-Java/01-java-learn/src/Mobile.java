import java.util.ArrayList;

public class Mobile {
	private String name;
	private double price;
	private String os;
	private String brand;
	private int instock;
	
	public ArrayList<Mobile> mlist = new ArrayList<>();
	public ArrayList<Mobile> getMlist() {
		return mlist;
	}
	public void setMlist(ArrayList<Mobile> mlist) {
		this.mlist = mlist;
	}
	public Mobile(String name, double price, String os, String brand, int instock) {
		super();
		this.name = name;
		this.price = price;
		this.os = os;
		this.brand = brand;
		this.instock = instock;
	}
	public Mobile() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", os=" + os + ", brand=" + brand + ", instock=" + instock
				+ "]";
	}
	
	
	
}
