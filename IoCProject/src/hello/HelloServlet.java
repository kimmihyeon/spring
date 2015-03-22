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
        System.out.println("===> HelloServlet 객체 생성");
    }

    public void init() throws ServletException {
    	System.out.println("===> init() 메소드 호출");
    	servletName = "Gurum Servlet";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===> doGet() 메소드 호출");
	}
	
	public void destroy() {
		System.out.println("===> destroy() 메소드 호출");
		servletName = null;
	}

}







