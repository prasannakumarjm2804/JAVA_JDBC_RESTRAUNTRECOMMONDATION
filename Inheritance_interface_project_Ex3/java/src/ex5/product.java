package ex5;
public class product {
  private int productId;
  private String productName;
  private double price;
  public product(int productId, String productName, double price) {
      this.productId = productId;
      this.productName = productName;
      this.price = price;
  }
  public int getProductId() {

      return productId;
  }

  public void setProductId(int productId) {

      this.productId = productId;
  }
   public String getProductName() {
      return productName;
  }

  public void setProductName(String productName) {

      this.productName = productName;

  }

  public double getPrice() {

      return price;

  }

  public void setPrice(double price) {

      this.price = price;

  }
  public String toString() {

      return "Product{" +"productId=" + productId + ", productName='" + productName + '\'' + ", price=" + price +        '}';

  }

}

