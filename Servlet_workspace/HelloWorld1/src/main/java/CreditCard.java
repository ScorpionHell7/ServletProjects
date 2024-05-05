import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreditCard extends HttpServlet{
	static {
		System.out.println("1.Loading classes");
	}
	{
		System.out.println("2.Instance created");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("3.Init without parameters called");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("4.Init without parameters called");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("5.Service method called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("6.do get called");
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.getWriter().write("<ol>");
		for(int i=0;i<10;i++) {
			int start = generateRandomNumber(4);
			int end = generateRandomNumber(4);
			resp.getWriter().write("<li>"+start+" **** ***** "+end+"</li>");
		}
		resp.getWriter().write("</ol>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("7.destroy called");
	}
	
	public static int generateRandomNumber(int digits) {
        if (digits <= 0) {
            throw new IllegalArgumentException("Number of digits must be greater than zero");
        }

        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits) - 1;

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
	
}
