package com.post.action;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.post.bean.PostTo;
import com.post.delegate.PostMgrDelegate;
import com.post.util.UtilConstants;


public class SearchPostAction extends HttpServlet {

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
		
		PostMgrDelegate pmd=new PostMgrDelegate();
		
		try{
			
			Vector<PostTo> complaintInfo=pmd.viewComplaint();
			
			
			if(!complaintInfo.isEmpty()){
				
				request.setAttribute("status", UtilConstants._COMPLAINT_INFO);
				
				request.setAttribute("SearchComplaint", complaintInfo);
				
				path=UtilConstants._VIEW_COMPLAINT_HOME;			
			}
			else {
				
				request.setAttribute("status", UtilConstants._NO_COMPLAINTS);
				path=UtilConstants._VIEW_COMPLAINT_HOME;
				
			}
			
		}
		catch (NullPointerException e) {
			
			e.printStackTrace();
			
			request.setAttribute("status", UtilConstants._INVALID_ENTRIES);
			path=UtilConstants._VIEW_COMPLAINT_HOME;
			
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(path);
		
		rd.forward(request, response);
	}

}
