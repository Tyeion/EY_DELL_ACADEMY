package practiceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product {
    private String productName;
    private int productId;

    public Product(String productName, int productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}

interface ProductDAO {
    List<Product> getAllProducts();
    Product getProduct(int productId);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    int getProductid(Product product);
    
}


class ProductDAOImp implements ProductDAO {
    List<Product> products;

    public ProductDAOImp() {
        products = new ArrayList<>();
        Product product1 = new Product("Laptop", 101);
        Product product2 = new Product("Smartphone", 102);
        products.add(product1);
        products.add(product2);
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
    
    public Optional<Product> getProductAsNullOrNot(String productName){
    	List<Product> products = new ArrayList<>();
    	for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return Optional.of(product); // Product found, return it wrapped in Optional
            }
        }
        return Optional.ofNullable(null); 
//    	Product product = products.get(productName); 
//    	Optional<Product> opt = Optional.ofNullable(product);
//    	return opt;

    }

    @Override
    public Product getProduct(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName());
    }

    @Override
    public void updateProduct(Product product) {
        for (Product existingProduct : products) {
            if (existingProduct.getProductId() == product.getProductId()) {
                existingProduct.setProductName(product.getProductName());
                System.out.println("Product with ID " + product.getProductId() + " is updated.");
                return;
            }
        }
    }

    @Override
    public void deleteProduct(int productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId() == productId) {
                productToRemove = product;
                
                break;
            }
            
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product with ID " + productId + " is removed.");
        }
    }

	@Override
	public int getProductid(Product product) {
		// TODO Auto-generated method stub
		return product.getProductId();
	}
	

}

public class DAODesign_Pattern_Product {
    public static void main(String[] args) {
        ProductDAO productDao = new ProductDAOImp();

        for (Product product : productDao.getAllProducts()) {
            System.out.println("Product [Product ID " + product.getProductId() + " , Name: " + product.getProductName() + "]");
        }

        Product newProduct = new Product("Tablet", 103);
        productDao.addProduct(newProduct);

        Product newproduct1 = new Product(null,900);
        productDao.addProduct(newproduct1);
        
        Product updatedProduct = new Product("Updated Laptop", 101);
        productDao.updateProduct(updatedProduct);

        Product updateProduct = new Product(null,900);
        productDao.updateProduct(updateProduct);
        
        productDao.deleteProduct(102);
        
        Product product = productDao.getProduct(101); // Get a product by ID
        int productId = productDao.getProductid(product); // Retrieve the product ID
        System.out.println("Product ID: " + productId);
        
        
        
        
        
    }
}

