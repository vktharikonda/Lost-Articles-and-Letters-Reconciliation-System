package com.post.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.post.bean.PostTo;
import com.post.delegate.PostMgrDelegate;
import com.post.util.UtilConstants;

public class GetComplaintStatusAction extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

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

		     String path="";

		  try{
			  
			  HttpSession hs=request.getSession();
			  
			  String login=(String)hs.getAttribute("user");
			  
			 Vector<PostTo> ComplaintStatus= new PostMgrDelegate().getComplaintStatus(login);
			 
			  System.out.println("in update post action flag is.......... "+ComplaintStatus);
			  
			  if(!ComplaintStatus.isEmpty())
			  {
				  
				  request.setAttribute("status",UtilConstants._COMPLAINT_STATUS );
				  
				  request.setAttribute("ComplaintStatus", ComplaintStatus);
				  
				  path=UtilConstants._VIEW_COMPLAINTS_HOME;
				 }
			  else {
				  
               request.setAttribute("status",UtilConstants._NO_COMPLAINTS );
				  
				  path=UtilConstants._VIEW_COMPLAINTS_HOME; 
				
			}
			  
	   }
		  catch (NullPointerException e) {
			  
			e.printStackTrace();
			
			
			 request.setAttribute("status",UtilConstants._INVALID_ENTRIES );
			  
			  path=UtilConstants._VIEW_COMPLAINTS_HOME; 
		}
		
		
		  RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request,response);
		
		}

	}


