package com.covalense.jadbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Vector;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConnectionPool {
	private static PropertyUtil util = null;
	private Vector<Connection> pool = null;
	private int poolsize;
	private String dburl;
	private String userNM;
	private String password;
	private Connection con = null;
	private String drviverClassNM;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();

		}
		return poolRef;
	}

	private void Connection() throws Exception {
		loadProperties();
		initiationPool();
	}

	public void loadProperties() throws Exception {

		// Properties properties = new Properties();
		// properties.load(new FileInputStream("db.properties"));
		poolsize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		dburl = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_URL);
		userNM = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USERNM);
		password = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		drviverClassNM = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DRIVER_NAME);
	}

	private Properties PropertyUtila() {
		return null;
	}

	private void initiationPool() throws Exception {
		Class.forName(drviverClassNM);
		for (int i = 0; i < poolsize; i++) {
			con = DriverManager.getConnection(dburl, userNM, password);
			pool.add(con);
		} // end of for
	}// end of construction

	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
}// end of clas
