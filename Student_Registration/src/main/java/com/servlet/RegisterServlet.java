package com.servlet;

import java.io.IOException;
import com.entity.*;
import com.DAO.RegisterDAO;
import com.DB.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fname=req.getParameter("fname");
			String email=req.getParameter("email");
			String address=req.getParameter("address");
			String phonenum=req.getParameter("phonenum");
			String dob=req.getParameter("dob");
			String gender=req.getParameter("gender");
			String password=req.getParameter("password");
			
			System.out.println(fname+" "+email+" "+dob+" "+" "+address+" "+phonenum+" "+gender+" "+password);
			
			Student st=new Student();
			st.setName(fname);
			st.setEmail(email);
			st.setDob(dob);
			st.setAddress(address);
			st.setPhonenum(phonenum);
			st.setGender(gender);
			st.setPassword(password);
			
			RegisterDAO dao=new RegisterDAO(ConnectionProvider.getConnection());
			boolean f=dao.StudentRegister(st);
			
			HttpSession session=req.getSession();
			if(f)
			{
				session.setAttribute("Successmsg","YAYY! Registration Successful..");
				resp.sendRedirect("index.jsp");
			}
			else
			{
				session.setAttribute("Errormsg","OOPS! Something Went Wrong..");
				resp.sendRedirect("index.jsp");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
