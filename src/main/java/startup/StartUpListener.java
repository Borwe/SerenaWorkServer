package startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import database.DBManager;

/**
 * Application Lifecycle Listener implementation class StartUpListener
 *
 */
@WebListener
public class StartUpListener implements ServletContextListener {

	private Logger logger=LoggerFactory.getLogger(StartUpListener.class);
    /**
     * Default constructor. 
     */
    public StartUpListener() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("FUCKING BULLLLLLLSHITTTTTTTTT!!!!!!!!!!!!!!!!!!!!!!!!");
    	DBManager.init(arg0.getServletContext());
    }
	
}
