

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Task;

/**
 * Servlet implementation class GetTask
 */
@WebServlet("/recieve_task")
public class GetTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Logger logger=LoggerFactory.getLogger(GetTask.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		logger.info("THIS SHIT JUST GOT CALLED!!");
		JSONObject json_tasks=new JSONObject(request.getParameter("tasks"));
		List<Task> tasks=(List<Task>) json_tasks.get("task");
		logger.info("INFO: "+json_tasks);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
