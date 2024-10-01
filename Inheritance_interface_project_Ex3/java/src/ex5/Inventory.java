package ex5;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<product> products;

    public Inventory() {

        this.products = new ArrayList<>();

    }

    public void addProduct(product product) {

        products.add(product);

    }



    public void updateProduct(int index,product updatedProduct) {

        if (index >= 0 && index < products.size()) {

            products.set(index, updatedProduct);

        } else {

            System.out.println("Invalid index. No product updated.");

        }

    }



    public void removeProduct(int index) {

        if (index >= 0 && index < products.size()) {

            products.remove(index);

        } else {

            System.out.println("Invalid index. No product removed.");

        }

    }



    public product findProductById(int productId) {

        for (product product : products) {

            if (product.getProductId() == productId) {

                return product;

            }

        }

        return null; 

    }



    public void showAllProducts() {

        for (product product : products) {

            System.out.println(product);

        }

    }



    public List<product> getProducts() {

        return products;

    }

}










