package kr.co.seoulit.common.advice;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;

public class CORSFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		res.setHeader("Access-Control-Allow-Max-Age", "3600");
		res.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, "
				+ "Authorization, Origin, Accept, "
				+ "Access-Control-Request-Origin, Access-Control-Request-Credentials, "
				+ "Access-Control-Request-Methods, Access-Control-Request-Max-Age, Access-Control-Request-Headers");

		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
