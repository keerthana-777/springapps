package com.springapps.springorm.product.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;


public class ProductApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springorm/product/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		
//		createProduct(productdao, 1, "headphones", "noisecancellation", 250);
//		createProduct(productdao, 2, "smartphones", "android", 7000);
//		createProduct(productdao, 3, "smartwatch", "big display", 12000);
//		updateProduct(productdao);
//		deleteProduct(productdao);
		
		findProduct(productdao,2);
		
//		findAllProducts(productdao);
    }

	private static void findAllProducts(ProductDao productdao) {
		List<Product> products = productdao.findAll();
		System.out.println(products);
		
	}

	private static void findProduct(ProductDao productdao, int id) {
		Product product=productdao.find(id);
		System.out.println(product);
		
	}

	private static void deleteProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		productdao.delete(product);
		System.out.println("product deleted");
		
	}

	private static void updateProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(25000);
	    productdao.update(product);
		System.out.println("number of rows updated:");
		
		
	}

	private static void createProduct(ProductDao productdao, int id, String name, String desc, double price) {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(desc);
		product.setPrice(price);
		int result = productdao.create(product);
		System.out.println("number of rows inserted:" + result);
	}
}
