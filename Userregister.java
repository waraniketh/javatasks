

import java.io.IOException;import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Userregister")
public class Userregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("html,text");
		PrintWriter pos=response.getWriter();
 String name=request.getParameter("name1");
 String emailid=request.getParameter("emailid");
 String contact=request.getParameter("contact");
 String adress=request.getParameter("adress");
 String dob=request.getParameter("dob");
 String city=request.getParameter("city");
 String state=request.getParameter("state");
 String country=request.getParameter("country");	
 String country1=request.getParameter("country1");
 String country2=request.getParameter("country2");
	pos.write(name);
	pos.write(emailid);
	pos.write(contact);
	pos.write(adress);
	pos.write(dob);pos.write(city);pos.write(state);pos.write(country);pos.write(country1);pos.write(country2);
	
	}

}
