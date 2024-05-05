import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ShowContactServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		HashMap<String,String> hm = (HashMap<String, String>)session.getAttribute("contactsession");
		PrintWriter writer = resp.getWriter();
		writer.write("<table = border='5'>");
		for ( Entry<String, String> entry : hm.entrySet()) {
			writer.write("<tr>");
			writer.write("<td>"+entry.getKey()+"</td>");
			writer.write("<td>"+entry.getValue()+"</td>");
			writer.write("</tr>");
		}
		writer.write("</table>");
	}

}
