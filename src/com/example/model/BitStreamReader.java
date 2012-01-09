package com.example.model;


import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class BitStreamReader {
	public void readBitStream(HttpServletResponse response, 
		ServletContext ctx, String resource)
		throws IOException {
	
		int read = 0;
		byte[] bytes = new byte[1024];

		InputStream is = ctx.getResourceAsStream(resource);

		OutputStream os = response.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
		os.flush();
		os.close();
	}
}

