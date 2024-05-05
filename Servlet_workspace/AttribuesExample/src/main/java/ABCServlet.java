import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ABCServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ArrayList<String> applicationnames = new ArrayList<String>();
		ArrayList<String> sessionnames = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			names.add("name"+i);
			sessionnames.add("name_session"+i);
			applicationnames.add("app names"+i);
		}
		getServletContext().setAttribute("applicationnames", applicationnames);
		session.setAttribute("sessionnames", sessionnames);
		req.setAttribute("names", names);
		req.getRequestDispatcher("abc.jsp").forward(req, resp);
	}

}
