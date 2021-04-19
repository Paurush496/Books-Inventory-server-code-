package com.bookstore.bookstoreservice.APIResponseParser;

public class APIResponse {
	
	String kind;
	int totalItems;
	APIBookItem[] items;
	
	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
	/**
	 * @return the totalItems
	 */
	public int getTotalItems() {
		return totalItems;
	}
	/**
	 * @param totalItems the totalItems to set
	 */
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	/**
	 * @return the items
	 */
	public APIBookItem[] getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(APIBookItem[] items) {
		this.items = items;
	}
	
}
