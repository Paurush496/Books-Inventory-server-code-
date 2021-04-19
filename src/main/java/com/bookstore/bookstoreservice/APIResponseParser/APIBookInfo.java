package com.bookstore.bookstoreservice.APIResponseParser;

import java.util.Arrays;
import java.util.HashMap;

public class APIBookInfo {
	
	String title;
	String subtitle;
	String[] authors;
	String publisher;
	String publishedDate;
	String description;
	HashMap<String,String>[] industryIdentifiers;
	Object readingModes;
	int pageCount;
	String printType;
	String[] categories;
	String maturityRating;
	boolean allowAnonLogging;
	String contentVersion;
	Object panelizationSummary;
	Object imageLinks;
	String language;
	String previewLink;
	String infoLink;
	String canonicalVolumeLink;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the publishedDate
	 */
	public String getPublishedDate() {
		return publishedDate;
	}
	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the industryIdentifiers
	 */
	public HashMap<String, String>[] getIndustryIdentifiers() {
		return industryIdentifiers;
	}
	/**
	 * @param industryIdentifiers the industryIdentifiers to set
	 */
	public void setIndustryIdentifiers(HashMap<String, String>[] industryIdentifiers) {
		this.industryIdentifiers = industryIdentifiers;
	}
	/**
	 * @return the readingModes
	 */
	public Object getReadingModes() {
		return readingModes;
	}
	/**
	 * @param readingModes the readingModes to set
	 */
	public void setReadingModes(Object readingModes) {
		this.readingModes = readingModes;
	}
	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return the printType
	 */
	public String getPrintType() {
		return printType;
	}
	/**
	 * @param printType the printType to set
	 */
	public void setPrintType(String printType) {
		this.printType = printType;
	}
	/**
	 * @return the categories
	 */
	public String[] getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String[] categories) {
		this.categories = categories;
	}
	/**
	 * @return the maturityRating
	 */
	public String getMaturityRating() {
		return maturityRating;
	}
	/**
	 * @param maturityRating the maturityRating to set
	 */
	public void setMaturityRating(String maturityRating) {
		this.maturityRating = maturityRating;
	}
	/**
	 * @return the allowAnonLogging
	 */
	public boolean isAllowAnonLogging() {
		return allowAnonLogging;
	}
	/**
	 * @param allowAnonLogging the allowAnonLogging to set
	 */
	public void setAllowAnonLogging(boolean allowAnonLogging) {
		this.allowAnonLogging = allowAnonLogging;
	}
	/**
	 * @return the contentVersion
	 */
	public String getContentVersion() {
		return contentVersion;
	}
	/**
	 * @param contentVersion the contentVersion to set
	 */
	public void setContentVersion(String contentVersion) {
		this.contentVersion = contentVersion;
	}
	/**
	 * @return the panelizationSummary
	 */
	public Object getPanelizationSummary() {
		return panelizationSummary;
	}
	/**
	 * @param panelizationSummary the panelizationSummary to set
	 */
	public void setPanelizationSummary(Object panelizationSummary) {
		this.panelizationSummary = panelizationSummary;
	}
	/**
	 * @return the imageLinks
	 */
	public Object getImageLinks() {
		return imageLinks;
	}
	/**
	 * @param imageLinks the imageLinks to set
	 */
	public void setImageLinks(Object imageLinks) {
		this.imageLinks = imageLinks;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the previewLink
	 */
	public String getPreviewLink() {
		return previewLink;
	}
	/**
	 * @param previewLink the previewLink to set
	 */
	public void setPreviewLink(String previewLink) {
		this.previewLink = previewLink;
	}
	/**
	 * @return the infoLink
	 */
	public String getInfoLink() {
		return infoLink;
	}
	/**
	 * @param infoLink the infoLink to set
	 */
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}
	/**
	 * @return the canonicalVolumeLink
	 */
	public String getCanonicalVolumeLink() {
		return canonicalVolumeLink;
	}
	/**
	 * @param canonicalVolumeLink the canonicalVolumeLink to set
	 */
	public void setCanonicalVolumeLink(String canonicalVolumeLink) {
		this.canonicalVolumeLink = canonicalVolumeLink;
	}
	
	@Override
	public String toString() {
		return "APIBookInfo [title=" + title + ", subtitle=" + subtitle + ", authors=" + Arrays.toString(authors)
				+ ", publisher=" + publisher + ", publishedDate=" + publishedDate + ", description=" + description
				+ ", industryIdentifiers=" + Arrays.toString(industryIdentifiers) + ", readingModes=" + readingModes
				+ ", pageCount=" + pageCount + ", printType=" + printType + ", categories="
				+ Arrays.toString(categories) + ", maturityRating=" + maturityRating + ", allowAnonLogging="
				+ allowAnonLogging + ", contentVersion=" + contentVersion + ", panelizationSummary="
				+ panelizationSummary + ", imageLinks=" + imageLinks + ", language=" + language + ", previewLink="
				+ previewLink + ", infoLink=" + infoLink + ", canonicalVolumeLink=" + canonicalVolumeLink + "]";
	}

}
