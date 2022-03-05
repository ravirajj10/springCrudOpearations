package com.saikrupa.entities;

public class CustomerOrders {
	private String CustomerOrdersOrderId = null;
	private String CustomerOrdersCutomerId = null;
	private String CustomerOrdersCustomerPaymentMethodId = null;
	private String CustomerOrdersDateOrderPlaced = null;
	private String CustomerOrdersDateOrderPaid = null;
	private String CustomerOrdersDescription = null;
	private String CustomerOrdersTotalClothesCount = null;

	public String getCustomerOrdersOrderId() {
		return CustomerOrdersOrderId;
	}

	public void setCustomerOrdersOrderId(String customerOrdersOrderId) {
		CustomerOrdersOrderId = customerOrdersOrderId;
	}

	public String getCustomerOrdersCutomerId() {
		return CustomerOrdersCutomerId;
	}

	public void setCustomerOrdersCutomerId(String customerOrdersCutomerId) {
		CustomerOrdersCutomerId = customerOrdersCutomerId;
	}

	public String getCustomerOrdersCustomerPaymentMethodId() {
		return CustomerOrdersCustomerPaymentMethodId;
	}

	public void setCustomerOrdersCustomerPaymentMethodId(String customerOrdersCustomerPaymentMethodId) {
		CustomerOrdersCustomerPaymentMethodId = customerOrdersCustomerPaymentMethodId;
	}

	public String getCustomerOrdersDateOrderPlaced() {
		return CustomerOrdersDateOrderPlaced;
	}

	public void setCustomerOrdersDateOrderPlaced(String customerOrdersDateOrderPlaced) {
		CustomerOrdersDateOrderPlaced = customerOrdersDateOrderPlaced;
	}

	public String getCustomerOrdersDateOrderPaid() {
		return CustomerOrdersDateOrderPaid;
	}

	public void setCustomerOrdersDateOrderPaid(String customerOrdersDateOrderPaid) {
		CustomerOrdersDateOrderPaid = customerOrdersDateOrderPaid;
	}

	public String getCustomerOrdersDescription() {
		return CustomerOrdersDescription;
	}

	public void setCustomerOrdersDescription(String customerOrdersDescription) {
		CustomerOrdersDescription = customerOrdersDescription;
	}

	public String getCustomerOrdersTotalClothesCount() {
		return CustomerOrdersTotalClothesCount;
	}

	public void setCustomerOrdersTotalClothesCount(String customerOrdersTotalClothesCount) {
		CustomerOrdersTotalClothesCount = customerOrdersTotalClothesCount;
	}

	@Override
	public String toString() {
		return "CustomerOrders [CustomerOrdersOrderId=" + CustomerOrdersOrderId + ", CustomerOrdersCutomerId="
				+ CustomerOrdersCutomerId + ", CustomerOrdersCustomerPaymentMethodId="
				+ CustomerOrdersCustomerPaymentMethodId
				+ ", CustomerOrdersDateOrderPlaced=" + CustomerOrdersDateOrderPlaced + ", CustomerOrdersDateOrderPaid="
				+ CustomerOrdersDateOrderPaid + ", CustomerOrdersDescription=" + CustomerOrdersDescription
				+ ", CustomerOrdersTotalClothesCount=" + CustomerOrdersTotalClothesCount + "]";
	}

}
