package org.kh.users.model.vo;

public class SearchVo {

	private String select, keyword;

	@Override
	public String toString() {
		return "SearchVo [select=" + select + ", keyword=" + keyword + "]";
	}

	public SearchVo(String select, String keyword) {
		super();
		this.select = select;
		this.keyword = keyword;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
