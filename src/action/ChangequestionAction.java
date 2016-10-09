package com.post.action;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.post.delegate.SecurityMgrDelegate;
import com.post.formbean.Profile;

public class ChangequestionAction extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String target="Changequestion.jsp?status=Change Failed"; 
	    try{
	    	  HttpSession session=request.getSession();
	    	  Profile rb=new Profile();
	          String loginid=request.getParameter("username");
	          String password=request.getParameter("password");
	          String sanswer=request.getParameter("sanswer");
	          String squestid="";
	          
	           if(request.getParameter("ch")!=null)
	          {
	              rb.setSecretQuestionID(request.getParameter("ownquest"));
	            
	          }
	          else
	          {
	              squestid=request.getParameter("squest");
	              rb.setSecretQuestionID(squestid);
	            
	          }
	         
	          rb.setLoginID(loginid);
	          rb.setPassword(password);
	          rb.setSecretAnswer(sanswer);
	          
	          boolean flag=new SecurityMgrDelegate().changeQuestion(rb);
	          
	          String pathstring="./jsps/LoginForm.jsp";
	          if(((String)session.getAttribute("role")).equals("admin"))
	            pathstring="./jsps/Changequestion.jsp";
	          else
	            pathstring="./jsps/Changequestion.jsp";
	            
	          
	          if(flag){
	             target = pathstring;
	          request.setAttribute("status","Change Success"); 
	          }
	          else { 
	              target = "./jsps/Changequestion.jsp";
	              request.setAttribute("status","Change Failed"); 
	          }
	        }catch(Exception e){}      
	          RequestDispatcher rd = request.getRequestDispatcher(target);
	          rd.forward(request,response);
	}

}