package database;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DBManager {

	//hold simpleDriverDatabase
	private static SimpleDriverDataSource simpleDriverDataSource=null;
	
	public static synchronized void init() {
		if(simpleDriverDataSource==null) {
			simpleDriverDataSource=new SimpleDriverDataSource();
			
		}
	}
}
