package com.springapps.springcore.propertyplaceholder;

public class MyDAO {
	private String dburl;
	private String dbuser;
	private String dbpassword;
	
	public MyDAO(String dburl, String dbuser, String dbpassword) {
		super();
		this.dburl = dburl;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}
	@Override
	public String toString() {
		return "MyDAO [dburl=" + dburl + ", dbuser=" + dbuser + ", dbpassword=" + dbpassword + "]";
	}
	

}
