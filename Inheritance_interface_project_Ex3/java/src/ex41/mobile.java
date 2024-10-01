package ex41;
public class mobile {

 private String mobilename;
 private int mobileid;
 private String avail;
  private int price;

 public mobile()

	{

		

	}

	public mobile(String mobilename,int mobileid,String avail,int price)

	{
		this.mobilename=mobilename;
		this.mobileid=mobileid;
		this.avail=avail;
		this.price=price;
	}
	public String getmobilename() {
		return mobilename;
	}

	public void setmobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public int getmobileid() {

		return mobileid;

	}

	public void setmobileid(int mobileid) {

		this.mobileid = mobileid;

	}

	public String getAvail() {

		return avail;

	}

	public void setAvail(String avail) {

		this.avail = avail;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;
	}

	@Override

	public String toString() {

		return "Mobile [Brand=" + mobilename + ",mobileid=" +mobileid + ", Quantity=" + avail + ", price=" + price + "]";

	}
}
