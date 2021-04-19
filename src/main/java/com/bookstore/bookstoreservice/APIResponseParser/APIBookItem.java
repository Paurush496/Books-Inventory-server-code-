package com.bookstore.bookstoreservice.APIResponseParser;

public class APIBookItem {
	
	String kind;
	String id;
	String etag;
	String selfLink;
	APIBookInfo volumeInfo;
	Object saleInfo;
	Object accessInfo;
	Object searchInfo;
	
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
	 * @return the etag
	 */
	public String getEtag() {
		return etag;
	}
	/**
	 * @param etag the etag to set
	 */
	public void setEtag(String etag) {
		this.etag = etag;
	}
	/**
	 * @return the selfLink
	 */
	public String getSelfLink() {
		return selfLink;
	}
	/**
	 * @param selfLink the selfLink to set
	 */
	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
	}
	/**
	 * @return the volumeInfo
	 */
	public APIBookInfo getVolumeInfo() {
		return volumeInfo;
	}
	/**
	 * @param volumeInfo the volumeInfo to set
	 */
	public void setVolumeInfo(APIBookInfo volumeInfo) {
		this.volumeInfo = volumeInfo;
	}
	/**
	 * @return the saleInfo
	 */
	public Object getSaleInfo() {
		return saleInfo;
	}
	/**
	 * @param saleInfo the saleInfo to set
	 */
	public void setSaleInfo(Object saleInfo) {
		this.saleInfo = saleInfo;
	}
	/**
	 * @return the accessInfo
	 */
	public Object getAccessInfo() {
		return accessInfo;
	}
	/**
	 * @param accessInfo the accessInfo to set
	 */
	public void setAccessInfo(Object accessInfo) {
		this.accessInfo = accessInfo;
	}
	/**
	 * @return the searchInfo
	 */
	public Object getSearchInfo() {
		return searchInfo;
	}
	/**
	 * @param searchInfo the searchInfo to set
	 */
	public void setSearchInfo(Object searchInfo) {
		this.searchInfo = searchInfo;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "APIBookItem [kind=" + kind + ", id=" + id + ", etag=" + etag + ", selfLink=" + selfLink
				+ ", volumeInfo=" + volumeInfo + ", saleInfo=" + saleInfo + ", accessInfo=" + accessInfo
				+ ", searchInfo=" + searchInfo + "]";
	}

}
