package com.saikrupa.entities;

public class CustomerOrdersClothesProducts {
	private String COCPProductId = null;
	private String COCPClothesQuantity = null;
	private String COCPDescription = null;


	public String getCOCPProductId() {
		return COCPProductId;
	}

	public void setCOCPProductId(String cOCPProductId) {
		COCPProductId = cOCPProductId;
	}

	public String getCOCPClothesQuantity() {
		return COCPClothesQuantity;
	}

	public void setCOCPClothesQuantity(String cOCPClothesQuantity) {
		COCPClothesQuantity = cOCPClothesQuantity;
	}

	public String getCOCPDescription() {
		return COCPDescription;
	}

	public void setCOCPDescription(String cOCPDescription) {
		COCPDescription = cOCPDescription;
	}

	@Override
	public String toString() {
		return "CustomerOrdersClothesProducts [ COCPProductId=" + COCPProductId
				+ ", COCPClothesQuantity=" + COCPClothesQuantity + ", COCPDescription=" + COCPDescription + "]";
	}

}
