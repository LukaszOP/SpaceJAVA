/**
 * 
 */
package com.itnew.application.product;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itnew.application.ImageryType;
import com.itnew.application.ProductFootprint;

/**
 * @author Lukasz Nowicki
 *
 */
@Service
public class ProductService {

	private List<Product> products = Arrays.asList(
			new Product("Misja na Marsa", new Date(), new ProductFootprint(), 2.54, "Mars"),
			new Product("Misja na Jowisza", new Date(), new ProductFootprint(), 2.54, "Mars"),
			new Product("Misja na Saturna", new Date(), new ProductFootprint(), 2.54, "Mars")
			);
			
	public List<Product> getAllProducts() {
		return products;
	}
	
	
	
	public Product getProduct(String missionName, ImageryType imageryType, Date productAquisitionDate) {
		//return products.stream().filter(t -> (t.getMissionName().equals(missionName)) && (t.getImageryType().equal) &&(t.getProductAquisitionDate().equals(productAquisitionDate))).findFirst().get();
		return new Product();
	}
		
	
}
