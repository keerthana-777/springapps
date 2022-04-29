package com.springapps.springcore.shopcart;

public class ShoppingCart {
	private String customername;
	private Items item;

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [customername=" + customername + ", item=" + item + "]";
	}

}
