package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.BitStreamReader;

public class ImageGrabber extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		response.setContentType("image/jpeg");
		String resource = "/ruth.jpg";

		ServletContext ctx = getServletContext();

		BitStreamReader bsr = new BitStreamReader();
		bsr.readBitStream(response, ctx, resource);
	}

}


