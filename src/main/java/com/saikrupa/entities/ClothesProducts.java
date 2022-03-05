package com.saikrupa.entities;

public class ClothesProducts {
	private String clothsProductsId = null;
	private String clothsProductsType = null;
	private String clothsProductsName = null;
	private String clothsProductsPrice = null;

	public String getClothsProductsId() {
		return clothsProductsId;
	}

	public void setClothsProductsId(String clothsProductsId) {
		this.clothsProductsId = clothsProductsId;
	}

	public String getClothsProductsType() {
		return clothsProductsType;
	}

	public void setClothsProductsType(String clothsProductsType) {
		this.clothsProductsType = clothsProductsType;
	}

	public String getClothsProductsName() {
		return clothsProductsName;
	}

	public void setClothsProductsName(String clothsProductsName) {
		this.clothsProductsName = clothsProductsName;
	}

	public String getClothsProductsPrice() {
		return clothsProductsPrice;
	}

	public void setClothsProductsPrice(String clothsProductsPrice) {
		this.clothsProductsPrice = clothsProductsPrice;
	}

	@Override
	public String toString() {
		return "ClothesProducts [clothsProductsId=" + clothsProductsId + ", clothsProductsType=" + clothsProductsType
				+ ", clothsProductsName=" + clothsProductsName + ", clothsProductsPrice=" + clothsProductsPrice + "]";
	}

}
