package com.pardeep.Tyeion5Sep;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//POJO
class Product{
	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;
	public LocalDate getProdValidity() {
		return prodValidity;
	}

	public void setProdValidity(LocalDate prodValidity) {
		this.prodValidity = prodValidity;
	}

	Product(){}

	 Product(int product_id, String prod_name, String prod_desc,
			 int prod_quantity, double prod_price,LocalDate prodValidity) {
		
		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prodValidity= prodValidity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
	
	
	
	
}

interface ProductDAO{
	String nameOFProduct(Product p);
	int priceOfProduct(Product p);
	int quantityOfProduct(Product p);
	String descriptionOfProduct(Product p);
	LocalDate prodValidityDate(Product p);
	void deleteProduct(Product p);
	List<Product> getAllProduct();
	void updateProductName(Product p, String newName);
	
}

class ProductDAOImp1 implements ProductDAO{
	List<Product> listOfProducts = new ArrayList<>();
	
	public ProductDAOImp1() {
		
		Product p1 =new Product(123,"A","B",10,10.29,LocalDate.now());
		Product p2 =new Product(124,"C","D",20,20.29,LocalDate.of(2019, Month.FEBRUARY, 20));
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);
	}
	
	
	@Override
	public void updateProductName(Product p, String newName) {
	    for (Product product : listOfProducts) {
	        if (product.getProduct_id() == p.getProduct_id()) {
	            product.setProd_name(newName);
	            return;
	        }
	    }
	}

	
	@Override
	public String nameOFProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while(itr.hasNext()) {
			Product p2=itr.next();
//			if(p2.getProd_name().equalsIgnoreCase(p.getProd_name())) {
				return p2.getProd_name();
//			}
		}
		return null;
	}

	@Override
	public int priceOfProduct(Product p) {
		
		return 0;
	}

	@Override
	public int quantityOfProduct(Product p) {
		
		return 0;
	}

	@Override
	public String descriptionOfProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate prodValidityDate(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product p) {
		
		
		listOfProducts.remove(p);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return listOfProducts;
	}
	
	
	
}

public class ProductDAOClass {
	public static void main(String[] args) {
		ProductDAOImp1 obj=new ProductDAOImp1();
	
		Product productToUpdate = new Product(123, "ABC", "Updated Description", 10, 10.29, LocalDate.now());
        obj.updateProductName(productToUpdate, "PQR");
		
		for(Product p: obj.getAllProduct())
		{
			System.out.println("Product Id "+p.product_id+" product name is "+p.prod_name);
			System.out.println("Name of the product is "+p.getProd_name());
			System.out.println("Current date is "+p.prodValidity);
			System.out.println("Description is "+ p.prod_desc);
			System.out.println("Quantity of product is "+p.prod_quantity);
			obj.deleteProduct(p);
			
		}
		
	
		    
		
		
	}
	
	
	
}