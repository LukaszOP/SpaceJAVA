package com.itnew.application.product;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itnew.application.ImageryType;

/**
 * @author Lukasz Nowicki
 *
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllTopics() {
		return productService.getAllProducts();
	}
	
	@RequestMapping("/product/{missionName}")
	public String addProduct() {
		
		return "";
	}
	
	@RequestMapping("/product/{missionName}")
	public void removeProduct() {
		
	}
	
	@RequestMapping("/product/{missionName}")
	public Product getProduct(@PathVariable String missionName, ImageryType imageryType, Date productAquisitionDate) {
		return productService.getProduct(missionName, imageryType, productAquisitionDate);
	}
}
