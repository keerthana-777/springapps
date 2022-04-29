package com.springapps.springcore.properties;

import java.util.Properties;

public class Locations {

	@Override
	public String toString() {
		return "Locations [dialect=" + dialect + "]";
	}

	public Properties getDialect() {
		return dialect;
	}

	public void setDialect(Properties dialect) {
		this.dialect = dialect;
	}

	private Properties dialect;

}
