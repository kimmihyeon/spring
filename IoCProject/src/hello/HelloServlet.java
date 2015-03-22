package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String servletName;
 
    public HelloServlet() {      
        System.out.println("===> HelloServlet ��ü ����");
    }

    public void init() throws ServletException {
    	System.out.println("===> init() �޼ҵ� ȣ��");
    	servletName = "Gurum Servlet";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===> doGet() �޼ҵ� ȣ��");
	}
	
	public void destroy() {
		System.out.println("===> destroy() �޼ҵ� ȣ��");
		servletName = null;
	}

}







