package com.itnew.application.product;

import java.util.Date;

import com.itnew.application.ProductFootprint;

/**
 * @author Lukasz Nowicki
 *
 */
public class Product {
	private String missionName;
	private Date productAquisitionDate;
	private ProductFootprint productFootprint;
	private double price;
	private String productURL;
	
	public Product() {
		super();
		
	}
	
	public Product(String missionName, Date productAquisitionDate, ProductFootprint productFootprint, double price,
			String productURL) {
		super();
		this.missionName = missionName;
		this.productAquisitionDate = productAquisitionDate;
		this.productFootprint = productFootprint;
		this.price = price;
		this.productURL = productURL;
	}
	
	/**
	 * @return the missionName
	 */
	public String getMissionName() {
		return missionName;
	}
	/**
	 * @param missionName the missionName to set
	 */
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	/**
	 * @return the productAquisitionDate
	 */
	public Date getProductAquisitionDate() {
		return productAquisitionDate;
	}
	/**
	 * @param productAquisitionDate the productAquisitionDate to set
	 */
	public void setProductAquisitionDate(Date productAquisitionDate) {
		this.productAquisitionDate = productAquisitionDate;
	}
	/**
	 * @return the productFootprint
	 */
	public ProductFootprint getProductFootprint() {
		return productFootprint;
	}
	/**
	 * @param productFootprint the productFootprint to set
	 */
	public void setProductFootprint(ProductFootprint productFootprint) {
		this.productFootprint = productFootprint;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the productURL
	 */
	public String getProductURL() {
		return productURL;
	}
	/**
	 * @param productURL the productURL to set
	 */
	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}
}
