package test;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;

import com.example.model.BeerExpert;

public class BeerExpertTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {

		BeerExpert be = new BeerExpert();
		
	 	PrintWriter out = response.getWriter();	
		
		out.println("Testing amber.... <br>");
		
		List result1 = be.getBrands("amber");
	        Iterator beerIter = result1.iterator();
		while (beerIter.hasNext()) {
			out.println("try: " + beerIter.next());
		}

		out.println("<br><br>");
		out.println("Testing other.... <br>");
		
		List result2 = be.getBrands("whatever");
		beerIter.remove();
		beerIter = result2.iterator();
		while (beerIter.hasNext()) {
			out.println("try: " + beerIter.next());
		}
	}
}	
