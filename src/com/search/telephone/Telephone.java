package com.search.telephone;

import java.io.Serializable;

/**
 * Model类，存储查询到的结果数据结构
 *
 */
public class Telephone implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mobile; //�ֻ����
	
	private String queryResult; //true����false
	
	private String province; //ʡ
	
	private String city; //��
	
	private String areaCode; //���
	
	private String postCode; //�ʱ�
	
	private String corp; //
	
	private String card; //������

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	
	

}
