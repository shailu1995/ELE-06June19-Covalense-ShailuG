package com.covalense.jadbcapp.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	private static PropertyUtil util = null;
	Properties properties = null;

	public static PropertyUtil getPropertyUtil() {
		if (util==null) {
			util =new PropertyUtil();
			}
		return util;

	}

	public void PropertyUtil() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);

	}
}
