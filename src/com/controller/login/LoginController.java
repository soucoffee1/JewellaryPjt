package com.controller.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.bean.Users;
import com.dao.UserDAOImpl;
import com.service.UserDetails;
import com.service.UsersDetailsImpl;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	
	private UserDetails userdetials;
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		userdetials = new UsersDetailsImpl();
		
		   String str = null;  
	        StringBuffer sb = null;
	        JSONObject jObj = null;
	        BufferedReader br = null;
	 
	        try {
	            br = req.getReader();
	            sb = new StringBuffer();
	 
	            while ((str = br.readLine()) != null) {
	                sb.append(str);
	            }
	            jObj = new JSONObject(sb.toString());
	            String user_name = jObj.getString("username");
	            System.err.println("user_name - "+user_name);
	            
	            boolean userList = userdetials.findUser(user_name);
	           
	            System.err.println("user_valid - "+userList);
	            resp.setContentType("text/html");
	            resp.setCharacterEncoding("UTF-8");
	            resp.getWriter().write( String.valueOf(userList));
	            
	          
	            
	        } catch (IOException | JSONException ex) {
	            ex.printStackTrace();
	        }
		
	}

}
