import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XYZServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		System.out.println("Config obj:"+getServletConfig());
		System.out.println("Context obj:"+getServletContext());
		resp.getWriter().write("XYZ Servlet app name:"+context.getInitParameter("app_name"));
	}

}
