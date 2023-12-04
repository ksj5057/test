package com.sj.model;

public class CriteriaDTO {
	private int pagenum;
	private int amount;
	private String keyword;
	private String type;
	
	public CriteriaDTO() {
		this(1,10);
	}
	public CriteriaDTO(int pagenum, int amount) {
		this.pagenum = pagenum;
		this.amount = amount;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "CriteriaVO [pageNum=" + pagenum + ", amount=" + amount + ", keyword=" + keyword + ", type=" + type
				+ "]";
	}	
	
}
