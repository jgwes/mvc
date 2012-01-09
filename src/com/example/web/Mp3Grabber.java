package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.BitStreamReader;

public class Mp3Grabber extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		response.setContentType("audio/mp3");
		String resource = "/01 - I Spit Roses.mp3";

		ServletContext ctx = getServletContext();

		BitStreamReader bsr = new BitStreamReader();
		bsr.readBitStream(response, ctx, resource);
	}
}


