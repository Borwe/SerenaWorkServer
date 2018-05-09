package database;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DBManager {
	
	//logger
	private static Logger logger=LoggerFactory.getLogger(DBManager.class);

	//hold simpleDriverDatabase
	private static SimpleDriverDataSource simpleDriverDataSource=null;
	
	public static synchronized void init(ServletContext context) {
		//for testing when using sqlite
		testingInit(context);
	}
	
	private static void testingInit(ServletContext context) {
		//uses sqlite for testing but postgres for production
		if(simpleDriverDataSource==null) {
			simpleDriverDataSource=new SimpleDriverDataSource();
			simpleDriverDataSource.setDriverClass(org.sqlite.JDBC.class);
			
			String path=context.getRealPath("WEB-INF/tasks.db");
			logger.info("CONTEXT PATH::        "+path);
			
			simpleDriverDataSource.setUrl("jdbc:sqlite:"+path);
			
			//add a test script to see if database actually exists and works
		}
	}
}
