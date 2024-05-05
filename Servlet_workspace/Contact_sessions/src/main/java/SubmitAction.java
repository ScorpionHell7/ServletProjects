import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SubmitAction extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		HttpSession session = req.getSession();

		HashMap<String, String> contactsession = (HashMap<String, String>) session.getAttribute("contactsession");
		
		if(contactsession == null) {
			contactsession = new HashMap();
		}
		contactsession.put(name, phone);
		
		session.setAttribute("contactsession", contactsession);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
